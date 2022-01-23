package com.examenonline.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.examenonline.bean.CompraBE;
import com.examenonline.bean.DetalleCompraBE;
import com.examenonline.util.SQLServerConexion;

public class CompraDAO {

	@SuppressWarnings("static-access")
	public String  RegistrarCompra(CompraBE compra) {
		
		String respuesta = "ERROR";
		
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;
		CallableStatement cstm2 = null;
		CallableStatement cstm3 = null;
		PreparedStatement pstm1 = null;
		
		try {
			
			conn = new SQLServerConexion().getConexion();
			
			cstm = conn.prepareCall("{call dbo.USP_REGISTRA_COMPRA(?,?,?)}");
			cstm.setInt(1, compra.getIdUsuario());
			cstm.setDate(2, new java.sql.Date(System.currentTimeMillis()));
			cstm.setDouble(3, compra.getTotal());
			cstm.executeUpdate();
			
			String SQLidCompra = "select MAX(IdCompra) from Compra";
			pstm1 = conn.prepareStatement(SQLidCompra);
			rs = pstm1.executeQuery();
			rs.next();
			int idCompra = rs.getInt(1);
			
			for (DetalleCompraBE item : compra.getLstDetalleCompra()) {
				cstm2 = conn.prepareCall("{call dbo.USP_REGISTRA_DET_COMPRA(?,?,?,?,?)}");
				cstm2.setInt(1, idCompra);
				cstm2.setInt(2, item.getIdSuscripcion());
				cstm2.setInt(3, item.getCantidadMeses());
				cstm2.setDouble(4, item.getPrecioPorMes());
				cstm2.setInt(5, 1);
				cstm2.executeUpdate();
				
				cstm3 = conn.prepareCall("{call dbo.USP_ACTUALIZA_TIPO_USUARIO(?,?)}");
				cstm3.setInt(1, compra.getIdUsuario());
				cstm3.setInt(2, item.getIdSuscripcion());
				cstm3.executeUpdate();
			}
			
			conn.commit();
			respuesta = "OK";
			
		} catch (Exception e) {
			respuesta = "ERROR";
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (conn != null)conn.close();
				if (rs != null)rs.close();
				if (cstm != null)cstm.close();
				if (cstm2 != null)cstm2.close();
				if (cstm3 != null)cstm3.close();
				if (pstm1 != null)pstm1.close();
			} catch (Exception e2) {
				System.out.println("Error al cerras las conexiones");
			}
		}
		
		return respuesta;
		
	}
	
}
