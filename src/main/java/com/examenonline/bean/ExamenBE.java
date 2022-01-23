package com.examenonline.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ExamenBE implements Serializable {

	private int IdExamen;
	private Date FechaRegistro;
	private String FechaRegString;
	private Date FechaExpiracion;
	private String FechaExpString;
	private UsuarioBE Usuario;
	private TipoExamenBE TipoExamen;
	private AsignaturaBE Asignatura;
	private String Titulo;
	private String Clave;
	private String Descripcion;
	private int TiempoMaximo;
	private int TiempoRestante;
	private int EscalaCalificacion;
	private int NroPreguntas;
	private List<PreguntaBE> LstPreguntas;

	public ExamenBE() {
		super();
	}

	public ExamenBE(int idExamen, Date fechaRegistro, String fechaRegString, Date fechaExpiracion,
			String fechaExpString, UsuarioBE usuario, TipoExamenBE tipoExamen, AsignaturaBE asignatura, String titulo,
			String clave, String descripcion, int tiempoMaximo, int tiempoRestante, int escalaCalificacion,
			int nroPreguntas, List<PreguntaBE> lstPreguntas) {
		super();
		IdExamen = idExamen;
		FechaRegistro = fechaRegistro;
		FechaRegString = fechaRegString;
		FechaExpiracion = fechaExpiracion;
		FechaExpString = fechaExpString;
		Usuario = usuario;
		TipoExamen = tipoExamen;
		Asignatura = asignatura;
		Titulo = titulo;
		Clave = clave;
		Descripcion = descripcion;
		TiempoMaximo = tiempoMaximo;
		TiempoRestante = tiempoRestante;
		EscalaCalificacion = escalaCalificacion;
		NroPreguntas = nroPreguntas;
		LstPreguntas = lstPreguntas;
	}

	

	public int getIdExamen() {
		return IdExamen;
	}

	public void setIdExamen(int idExamen) {
		IdExamen = idExamen;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public String getFechaRegString() {
		return FechaRegString;
	}

	public void setFechaRegString(String fechaRegString) {
		FechaRegString = fechaRegString;
	}

	public Date getFechaExpiracion() {
		return FechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		FechaExpiracion = fechaExpiracion;
	}

	public String getFechaExpString() {
		return FechaExpString;
	}

	public void setFechaExpString(String fechaExpString) {
		FechaExpString = fechaExpString;
	}

	public UsuarioBE getUsuario() {
		return Usuario;
	}

	public void setUsuario(UsuarioBE usuario) {
		Usuario = usuario;
	}

	public TipoExamenBE getTipoExamen() {
		return TipoExamen;
	}

	public void setTipoExamen(TipoExamenBE tipoExamen) {
		TipoExamen = tipoExamen;
	}

	public AsignaturaBE getAsignatura() {
		return Asignatura;
	}

	public void setAsignatura(AsignaturaBE asignatura) {
		Asignatura = asignatura;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getTiempoMaximo() {
		return TiempoMaximo;
	}

	public void setTiempoMaximo(int tiempoMaximo) {
		TiempoMaximo = tiempoMaximo;
	}

	public int getTiempoRestante() {
		return TiempoRestante;
	}

	public void setTiempoRestante(int tiempoRestante) {
		TiempoRestante = tiempoRestante;
	}

	public int getEscalaCalificacion() {
		return EscalaCalificacion;
	}

	public void setEscalaCalificacion(int escalaCalificacion) {
		EscalaCalificacion = escalaCalificacion;
	}

	public int getNroPreguntas() {
		return NroPreguntas;
	}

	public void setNroPreguntas(int nroPreguntas) {
		NroPreguntas = nroPreguntas;
	}

	public List<PreguntaBE> getLstPreguntas() {
		return LstPreguntas;
	}

	public void setLstPreguntas(List<PreguntaBE> lstPreguntas) {
		LstPreguntas = lstPreguntas;
	}

}
