package edu.examenonline.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.examenonline.bean.RespuestaBE;
import com.examenonline.bean.UsuarioBE;
import com.examenonline.dao.UsuarioDAO;

@Path("/servicioUsuario")
public class ServicioUsuario {

	@Path("/pruebaServicio")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pruebaServicio(){
		return "OK";
	}
	
	@POST
	@Path("/obtenerUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioBE obtenerUsuario(String usuario){
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioBE oUsuario = dao.obtenerUsuario(usuario);
		return oUsuario;
	}
	
	@POST
	@Path("/registrarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaBE registrarUsuario(UsuarioBE usuario){
		System.out.println("Registrando el usuario: " + usuario.getNombres() + " " + usuario.getApellidoPaterno());
		UsuarioDAO dao = new UsuarioDAO();
		RespuestaBE respuesta = dao.registrarUsuario(usuario);
		return respuesta;
	}
}
