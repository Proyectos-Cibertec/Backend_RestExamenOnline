package edu.examenonline.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.examenonline.bean.UsuarioBE;
import com.examenonline.dao.UsuarioDAO;

@Path("/servicioLogin")
public class ServicioLogin {

	@Path("/pruebaServicio")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pruebaServicio(){
		return "OK";
	}
	
	@POST
	@Path("/iniciarSesion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioBE iniciarSesion(UsuarioBE usuario){
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioBE oUsuario = dao.iniciarSesion(usuario);
		System.out.println("Iniciando sesión: ");
		return oUsuario;
	}
}
