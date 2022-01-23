package edu.examenonline.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.examenonline.bean.CompraBE;
import com.examenonline.bean.ExamenBE;
import com.examenonline.bean.ExamenRealizadoBE;
import com.examenonline.bean.RespuestaBE;
import com.examenonline.dao.CompraDAO;
import com.examenonline.dao.ExamenDAO;
import com.examenonline.dao.RespuestaBean;

@Path("/servicioExamen")
public class ServicioExamen {

	@Path("/pruebaServicio")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pruebaServicio(){
		return "OK";
	}
	
	@Path("/ObtenerExamenesPublicos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ExamenBE> Usp_ObtenerExamenesPublicos(){
		System.out.println("Obteniendo la lista de Exámenes");
		ExamenDAO dao = new ExamenDAO();
		return dao.Usp_ObtenerExamenesPublicos();
	}
	
	@Path("/ObtenerExamenResolver")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ExamenRealizadoBE ObtenerExamenResolver(@QueryParam("IdExamen") int IdExamen, @QueryParam("idExamenRealizado") int idExamenRealizado){
		System.out.println("ObtenerExamenResolver");
		ExamenDAO dao = new ExamenDAO();
		return dao.ObtenerExamenResolver(IdExamen, idExamenRealizado);
	}
	
	@POST
	@Path("/RegistrarExamenRealizado")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response RegistrarExamenRealizado(ExamenRealizadoBE objExamenRealizado){
		System.out.println("Registrar Examen Realizado");
		ExamenDAO dao = new ExamenDAO();
		RespuestaBean resultado = new RespuestaBean();
		resultado =	dao.RegistrarExamenRealizado(objExamenRealizado);
		return Response.status(201).entity(resultado).build();
		
	}
	
	@POST
	@Path("/RegistrarCompra")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaBean RegistrarCompra(CompraBE compra){
		System.out.println("Registrar Compra");
		CompraDAO dao = new CompraDAO();
		RespuestaBean resultado = new RespuestaBean();
		resultado.setMensaje(dao.RegistrarCompra(compra));
		return resultado;//Response.status(201).entity(resultado).build();
	}
	
	@POST
	@Path("/RegistrarExamen")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaBE RegistrarExamen(ExamenBE examen){
		System.out.println("Registrar Examen");
		ExamenDAO dao = new ExamenDAO();
		RespuestaBE resultado = dao.RegistrarExamen(examen);
		return resultado;//Response.status(201).entity(resultado).build();
		
	}
	
}
