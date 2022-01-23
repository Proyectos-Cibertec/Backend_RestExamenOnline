package com.examenonline.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.examenonline.bean.AlternativaBE;
import com.examenonline.bean.ExamenBE;
import com.examenonline.bean.ExamenRealizadoBE;
import com.examenonline.bean.ExamenRealizadoDetalleBE;
import com.examenonline.bean.PreguntaBE;
import com.examenonline.bean.RespuestaBE;
import com.examenonline.bean.UsuarioBE;
import com.examenonline.util.SQLServerConexion;

public class ExamenDAO {

	@SuppressWarnings("static-access")
	public ExamenRealizadoBE ObtenerExamenResolver(int IdExamen, int idExamenRealizado) {

		ExamenRealizadoBE examenRealizado = null;
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ObtenerExamenResolver(?,?)}");
			cstm.setInt(1, IdExamen);
			cstm.setInt(2, idExamenRealizado);
			rs = cstm.executeQuery();

			while (rs.next()) {
				examenRealizado = new ExamenRealizadoBE();
				ExamenBE examen = new ExamenBE();

				UsuarioBE usuario = new UsuarioBE();

				examen.setIdExamen(rs.getInt("IdExamen"));
				examen.setFechaRegString(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("FechaRegistro")));
				examen.setFechaExpString(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("FechaExpiracion")));
				examen.setTitulo(rs.getString("Titulo"));
				examen.setDescripcion(rs.getString("Descripcion"));
				examen.setTiempoMaximo(rs.getInt("TiempoMaximo"));
				examen.setTiempoRestante(rs.getInt("TiempoRestante"));
				examen.setLstPreguntas(ListaPreguntasPorExamen(IdExamen));
				examenRealizado.setExamen(examen);

				examenRealizado.setEstado(rs.getBoolean("EstadoExamen"));
				examenRealizado.setValidaFechaExpiracion(rs.getInt("ValidaFechaExpiracion"));

				usuario.setIdUsuario(rs.getInt("IdUsuario"));
				usuario.setNombreCompleto(rs.getString("NombreCompleto"));
				usuario.setCorreo(rs.getString("Correo"));
				usuario.setImgData(rs.getString("imagen"));
				examen.setUsuario(usuario);
				examenRealizado.setUsuario(usuario);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return examenRealizado;

	}

	@SuppressWarnings("static-access")
	public List<PreguntaBE> ListaPreguntasPorExamen(int IdExamen) {

		ArrayList<PreguntaBE> Lista = new ArrayList<PreguntaBE>();
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ListarPreguntasPorExamen(?)}");
			cstm.setInt(1, IdExamen);
			rs = cstm.executeQuery();

			while (rs.next()) {

				PreguntaBE obj = new PreguntaBE();
				obj.setIdPregunta(rs.getInt("IdPregunta"));
				obj.setPregunta(rs.getString("Pregunta"));
				obj.setNumero(rs.getInt("Numero"));
				obj.setLstAlternativa(ListaAlternativaPorPregunta(obj.getIdPregunta()));
				Lista.add(obj);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return Lista;

	}

	@SuppressWarnings("static-access")
	public List<AlternativaBE> ListaAlternativaPorPregunta(int IdPregunta) {

		ArrayList<AlternativaBE> Lista = new ArrayList<AlternativaBE>();
		AlternativaBE objAlternativa = null;

		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ListarAlternativasPorPregunta(?)}");
			cstm.setInt(1, IdPregunta);
			rs = cstm.executeQuery();

			while (rs.next()) {

				objAlternativa = new AlternativaBE();
				PreguntaBE pregunta = new PreguntaBE();

				objAlternativa.setIdAlternativa(rs.getInt("IdAlternativa"));

				pregunta.setIdPregunta(rs.getInt("IdPregunta"));
				objAlternativa.setPregunta(pregunta);

				objAlternativa.setNumero(rs.getInt("Numero"));
				objAlternativa.setDescripcion(rs.getString("Descripcion"));
				objAlternativa.setOpcionCorrecta(rs.getBoolean("OpcionCorrecta"));
				objAlternativa.setCantAltCorrectas(rs.getInt("CantAltCorrectas"));

				Lista.add(objAlternativa);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return Lista;

	}

	@SuppressWarnings("static-access")
	public RespuestaBean RegistrarExamenRealizado(ExamenRealizadoBE objExamenRealizado) {

		RespuestaBean registra = new RespuestaBean();
		registra.setMensaje("ERROR");

		List<AlternativaBE> ArrayAltCorrectas = ListaAlternativaCorrectasPorExamen(
				objExamenRealizado.getExamen().getIdExamen());
		int CountAltCorrectas = 0;

		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;
		CallableStatement cstm2 = null;
		PreparedStatement pstm1 = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ActualizarExamenRealizado(?,?,?,?)}");
			cstm.setInt(1, objExamenRealizado.getUsuario().getIdUsuario());
			cstm.setInt(2, objExamenRealizado.getExamen().getIdExamen());
			cstm.setInt(3, objExamenRealizado.getTotalPreguntas());

			for (int i = 0; i < objExamenRealizado.getTotalPreguntas(); i++) {
				if (objExamenRealizado.getObjAltMarcUsua().get(i).getDescripcion()
						.equals(ArrayAltCorrectas.get(i).getDescripcion())) {
					CountAltCorrectas = CountAltCorrectas + 1;
				}
			}

			cstm.setInt(4, CountAltCorrectas);
			cstm.executeUpdate();

			String SQLidExamenRealizado = "select top 1 IdExamenRealizado from ExamenRealizado where IdUsuario = ? and IdExamen = ? order by IdExamenRealizado desc";
			pstm1 = conn.prepareStatement(SQLidExamenRealizado);
			pstm1.setInt(1, objExamenRealizado.getUsuario().getIdUsuario());
			pstm1.setInt(2, objExamenRealizado.getExamen().getIdExamen());
			rs = pstm1.executeQuery();
			rs.next();
			int idExamenRealizado = rs.getInt(1);

			if (objExamenRealizado.getLstExamenRealizadoDetalle() != null) {
				for (ExamenRealizadoDetalleBE det : objExamenRealizado.getLstExamenRealizadoDetalle()) {
					cstm2 = conn.prepareCall("{call dbo.Usp_InsertarExamenRealizadoDetalle(?,?,?)}");
					cstm2.setInt(1, idExamenRealizado);
					cstm2.setInt(2, det.getIdPregunta());
					cstm2.setInt(3, det.getIdAlternativa());
					cstm2.executeUpdate();
				}
			}

			conn.commit();
			registra.setMensaje("OK" + "," + idExamenRealizado);

		} catch (Exception e) {
			registra.setMensaje("ERROR");
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (cstm != null)
					cstm.close();
				if (cstm2 != null)
					cstm2.close();
			} catch (Exception e) {
				System.out.println("Se cae cuando se cierra");
			}
		}

		return registra;

	}

	@SuppressWarnings("static-access")
	public List<AlternativaBE> ListaAlternativaCorrectasPorExamen(int IdExamen) {
		ArrayList<AlternativaBE> Lista = new ArrayList<AlternativaBE>();

		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ListarPreguntasCorrectas(?)}");
			cstm.setInt(1, IdExamen);
			rs = cstm.executeQuery();

			while (rs.next()) {
				AlternativaBE obj = new AlternativaBE();
				obj.setNumero(rs.getInt("Numero"));
				obj.setDescripcion(rs.getString("Descripcion"));
				Lista.add(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLServerConexion.closeConexion(conn);
			SQLServerConexion.closeCallableStatement(cstm);
		}

		return Lista;
	}

	@SuppressWarnings("static-access")
	public List<ExamenBE> Usp_ObtenerExamenesPublicos() {

		ArrayList<ExamenBE> lstExamen = new ArrayList<ExamenBE>();
		ExamenBE objExamen = null;
		UsuarioBE objUsuario = null;

		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstm = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_ObtenerExamenesPublicos}");
			rs = cstm.executeQuery();

			while (rs.next()) {
				objExamen = new ExamenBE();
				objExamen.setIdExamen(rs.getInt("IdExamen"));
				objExamen.setFechaRegistro(rs.getDate("FechaRegistro"));
				
				objExamen.setFechaExpiracion(rs.getDate("FechaExpiracion"));
				objExamen.setFechaRegString(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("FechaRegistro")));
				objExamen.setFechaExpString(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("FechaExpiracion")));
				objExamen.setTitulo(rs.getString("Titulo"));
				objExamen.setDescripcion(rs.getString("Descripcion"));
				objExamen.setTiempoMaximo(rs.getInt("TiempoMaximo"));
				objExamen.setNroPreguntas(rs.getInt("NroPreguntas"));

				objUsuario = new UsuarioBE();
				objUsuario.setIdUsuario(rs.getInt("IdUsuario"));
				objUsuario.setNombreCompleto(rs.getString("Nombres"));
				objUsuario.setApellidoPaterno(rs.getString("ApellidoPaterno"));
				objUsuario.setApellidoMaterno(rs.getString("ApellidoMaterno"));
				objUsuario.setImgData(rs.getString("imagen"));

				objExamen.setUsuario(objUsuario);
				lstExamen.add(objExamen);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
				if (cstm != null)
					cstm.close();
			} catch (Exception e2) {
				System.out.println("Error cuando se cierra las conexiones");
			}
		}

		return lstExamen;

	}

	@SuppressWarnings("static-access")
	public RespuestaBE RegistrarExamen(ExamenBE examen) {

		RespuestaBE respuesta = new RespuestaBE();
		respuesta.setRegistra(false);

		Connection conn = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		CallableStatement cstm = null;
		CallableStatement cstm1 = null;
		CallableStatement cstm2 = null;
		PreparedStatement pstm1 = null;
		PreparedStatement pstm2 = null;

		try {

			conn = new SQLServerConexion().getConexion();

			cstm = conn.prepareCall("{call dbo.Usp_InsertarExamen(?,?,?,?,?,?,?,?)}");
			cstm.setDate(1, new java.sql.Date(System.currentTimeMillis()));
			cstm.setString(2, examen.getFechaExpString());
			cstm.setInt(3, examen.getUsuario().getIdUsuario());
			cstm.setString(4, examen.getTitulo());
			cstm.setString(5, examen.getDescripcion());
			cstm.setInt(6, examen.getTiempoMaximo());
			cstm.setInt(7, examen.getAsignatura().getIdAsignatura());
			cstm.setString(8, examen.getClave());
			cstm.executeUpdate();

			String SQLidExamen = "select MAX(IdExamen) from Examen";
			pstm1 = conn.prepareStatement(SQLidExamen);
			rs = pstm1.executeQuery();
			rs.next();
			int idExamen = rs.getInt(1);

			for (PreguntaBE pregunta : examen.getLstPreguntas()) {

				cstm1 = conn.prepareCall("{call dbo.Usp_InsertarPregunta(?,?,?)}");
				cstm1.setString(1, pregunta.getPregunta());
				cstm1.setInt(2, pregunta.getNumero());
				cstm1.setInt(3, idExamen);
				cstm1.executeUpdate();

				String SQLidPregunta = "select MAX(IdPregunta) from Pregunta";
				pstm2 = conn.prepareStatement(SQLidPregunta);
				rs1 = pstm2.executeQuery();
				rs1.next();
				int idPregunta = rs1.getInt(1);

				if (pregunta.getLstAlternativa() != null) {

					for (AlternativaBE alternativa : pregunta.getLstAlternativa()) {

						cstm2 = conn.prepareCall("{call dbo.Usp_InsertarAlternativa(?,?,?,?)}");
						cstm2.setInt(1, idPregunta);
						cstm2.setInt(2, alternativa.getNumero());
						cstm2.setString(3, alternativa.getDescripcion());
						cstm2.setBoolean(4, alternativa.isOpcionCorrecta());
						cstm2.executeUpdate();
					}

				}

			}

			conn.commit();
			respuesta.setRegistra(true);

		} catch (Exception e) {
			respuesta.setRegistra(false);
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		} finally {

			try {
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
				if (rs1 != null)
					rs1.close();
				if (cstm != null)
					cstm.close();
				if (cstm1 != null)
					cstm1.close();
				if (cstm2 != null)
					cstm2.close();
				if (pstm1 != null)
					pstm1.close();
				if (pstm2 != null)
					pstm2.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

		return respuesta;

	}

}
