package com.examenonline.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.examenonline.bean.RespuestaBE;
import com.examenonline.bean.RolBE;
import com.examenonline.bean.TipoUsuarioBE;
import com.examenonline.bean.UsuarioBE;
import com.examenonline.util.SQLServerConexion;
import com.examenonline.utilitarios.constantes.TipoUsuario;

public class UsuarioDAO {
	@SuppressWarnings("static-access")
	public UsuarioBE obtenerUsuario(String usuario) {

		UsuarioBE oUsuario = null;
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ObtenerUsuarioPorCuenta(?)}");
			cstm.setString(1, usuario);
			
			rs = cstm.executeQuery();

			if (rs.next()) {
				
				oUsuario = new UsuarioBE();
				oUsuario.Rol = new RolBE();
				
				oUsuario.setIdUsuario(rs.getInt("IdUsuario"));
				oUsuario.setNombres(rs.getString("Nombres"));
				oUsuario.setApellidoPaterno(rs.getString("ApellidoPaterno"));
				oUsuario.setApellidoMaterno(rs.getString("ApellidoMaterno"));
				oUsuario.setCorreo(rs.getString("Correo"));
				oUsuario.setDni(rs.getString("Dni"));
				oUsuario.setUsuario(rs.getString("Usuario"));
				oUsuario.setContraseña(rs.getString("Contraseña"));
				oUsuario.setFechaRegistro(rs.getDate("FechaRegistro"));
				oUsuario.setImgData(rs.getString("imagen"));
				oUsuario.setIntentos(rs.getInt("Intentos"));
				oUsuario.setBloqueado(rs.getBoolean("Bloqueado"));
				oUsuario.Rol.setIdRol(rs.getInt("IdRol"));
				oUsuario.Rol.setNombreRol(rs.getString("NombreRol"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return oUsuario;
	}
	
	
	@SuppressWarnings("static-access")
	public UsuarioBE iniciarSesion(UsuarioBE usuario) {

		UsuarioBE oUsuario = null;
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();
			
			cstm = conn.prepareCall("{call dbo.Usp_Login(?,?)}");
			cstm.setString(1, usuario.getUsuario());
			cstm.setString(2, usuario.getContraseña());
			
			rs = cstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					oUsuario = new UsuarioBE();
					oUsuario.Rol = new RolBE();
					oUsuario.TipoUsuario = new TipoUsuarioBE();
					
					oUsuario.setIdUsuario(rs.getInt("IdUsuario"));
					oUsuario.setNombres(rs.getString("Nombres"));
					oUsuario.setApellidoPaterno(rs.getString("ApellidoPaterno"));
					oUsuario.setApellidoMaterno(rs.getString("ApellidoMaterno"));
					oUsuario.setCorreo(rs.getString("Correo"));
					oUsuario.setDni(rs.getString("Dni"));
					oUsuario.setUsuario(rs.getString("Usuario"));
					oUsuario.setContraseña(rs.getString("Contraseña"));
					oUsuario.setImgData(rs.getString("imagen"));
					oUsuario.setFechaRegistro(rs.getDate("FechaRegistro"));
					oUsuario.setIntentos(rs.getInt("Intentos"));
					oUsuario.setBloqueado(rs.getBoolean("Bloqueado"));
					oUsuario.TipoUsuario.setIdTipoUsuario(rs.getInt("IdTipoUsuario"));
					oUsuario.TipoUsuario.setDescripcion(rs.getString("Descripcion"));
					oUsuario.Rol.setIdRol(rs.getInt("IdRol"));
					oUsuario.Rol.setNombreRol(rs.getString("NombreRol"));
					
				}
			}

		} catch (Exception e) {
			
			
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return oUsuario;
	}
	
	@SuppressWarnings("static-access")
	public RespuestaBE registrarUsuario(UsuarioBE usuario) {
		RespuestaBE respuesta = new RespuestaBE();
		respuesta.setRegistra(false);
		
		Connection conn = null;
		CallableStatement cstm = null;

		try {
			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.USP_MANTENIMIENTO_USUARIO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cstm.setString(1, "");
			cstm.setString(2, usuario.getNombres());
			cstm.setString(3, usuario.getApellidoPaterno());
			cstm.setString(4, usuario.getApellidoMaterno());
			cstm.setString(5, usuario.getCorreo());
			cstm.setString(6, usuario.getDni());
			cstm.setString(7, usuario.getUsuario());
			cstm.setString(8, usuario.getContrasenia());
			cstm.setString(9, usuario.getImgData()); // ImagenDataURL64
			cstm.setInt(10, 3); // Intentos
			cstm.setInt(11, 0); // Bloqueado
			cstm.setInt(12, TipoUsuario.FREE); // 0: Usuario FREE por defecto
			cstm.setInt(13, 1); // Estado
			cstm.setString(14, ""); // Crea
			cstm.setString(15, ""); // Modifica
			cstm.setString(16, ""); // Elimina
			cstm.setInt(17, 1); // Evento
			cstm.executeUpdate();
			
			respuesta.setRegistra(true);			

		} catch (SQLException e) {
			respuesta.setRegistra(false);
			respuesta.setMensajeError(e.getMessage());
			respuesta.setCodigoError(e.getErrorCode());
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			respuesta.setRegistra(false);
			respuesta.setMensajeError(e.getMessage());
			respuesta.setCodigoError(-1);
			
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return respuesta;
	}
}
