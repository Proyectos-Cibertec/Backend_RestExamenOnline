package com.examenonline.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ExamenRealizadoBE implements Serializable {

	public int IdExamenRealizado;
	public UsuarioBE Usuario;
	public ExamenBE Examen;
	public Date FechaRealizacion;
	public String StrFechaRealizacion;
	public Date FechaTermino;
	public String StrFechaTermino;
	public int TotalPreguntas;
	public int NumeroPreguntasCorrectas;
	public boolean Estado;
	public List<ExamenRealizadoDetalleBE> LstExamenRealizadoDetalle;
	public int ValidaFechaExpiracion;
	public List<AlternativaBE> ObjAltMarcUsua;

	public ExamenRealizadoBE() {

	}

	public ExamenRealizadoBE(int idExamenRealizado, UsuarioBE usuario, ExamenBE examen, Date fechaRealizacion,
			String strFechaRealizacion, Date fechaTermino, String strFechaTermino, int totalPreguntas,
			int numeroPreguntasCorrectas, boolean estado, List<ExamenRealizadoDetalleBE> lstExamenRealizadoDetalle,
			int validaFechaExpiracion, List<AlternativaBE> objAltMarcUsua) {
		super();
		this.IdExamenRealizado = idExamenRealizado;
		this.Usuario = usuario;
		this.Examen = examen;
		this.FechaRealizacion = fechaRealizacion;
		this.StrFechaRealizacion = strFechaRealizacion;
		this.FechaTermino = fechaTermino;
		this.StrFechaTermino = strFechaTermino;
		this.TotalPreguntas = totalPreguntas;
		this.NumeroPreguntasCorrectas = numeroPreguntasCorrectas;
		this.Estado = estado;
		this.LstExamenRealizadoDetalle = lstExamenRealizadoDetalle;
		this.ValidaFechaExpiracion = validaFechaExpiracion;
		this.ObjAltMarcUsua = objAltMarcUsua;
	}

	public int getIdExamenRealizado() {
		return IdExamenRealizado;
	}

	public void setIdExamenRealizado(int idExamenRealizado) {
		this.IdExamenRealizado = idExamenRealizado;
	}

	public UsuarioBE getUsuario() {
		return Usuario;
	}

	public void setUsuario(UsuarioBE usuario) {
		this.Usuario = usuario;
	}

	public ExamenBE getExamen() {
		return Examen;
	}

	public void setExamen(ExamenBE examen) {
		this.Examen = examen;
	}

	public Date getFechaRealizacion() {
		return FechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.FechaRealizacion = fechaRealizacion;
	}

	public String getStrFechaRealizacion() {
		return StrFechaRealizacion;
	}

	public void setStrFechaRealizacion(String strFechaRealizacion) {
		this.StrFechaRealizacion = strFechaRealizacion;
	}

	public Date getFechaTermino() {
		return FechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.FechaTermino = fechaTermino;
	}

	public String getStrFechaTermino() {
		return StrFechaTermino;
	}

	public void setStrFechaTermino(String strFechaTermino) {
		this.StrFechaTermino = strFechaTermino;
	}

	public int getTotalPreguntas() {
		return TotalPreguntas;
	}

	public void setTotalPreguntas(int totalPreguntas) {
		this.TotalPreguntas = totalPreguntas;
	}

	public int getNumeroPreguntasCorrectas() {
		return NumeroPreguntasCorrectas;
	}

	public void setNumeroPreguntasCorrectas(int numeroPreguntasCorrectas) {
		this.NumeroPreguntasCorrectas = numeroPreguntasCorrectas;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

	public List<ExamenRealizadoDetalleBE> getLstExamenRealizadoDetalle() {
		return LstExamenRealizadoDetalle;
	}

	public void setLstExamenRealizadoDetalle(List<ExamenRealizadoDetalleBE> lstExamenRealizadoDetalle) {
		this.LstExamenRealizadoDetalle = lstExamenRealizadoDetalle;
	}

	public int getValidaFechaExpiracion() {
		return ValidaFechaExpiracion;
	}

	public void setValidaFechaExpiracion(int validaFechaExpiracion) {
		this.ValidaFechaExpiracion = validaFechaExpiracion;
	}

	public List<AlternativaBE> getObjAltMarcUsua() {
		return ObjAltMarcUsua;
	}

	public void setObjAltMarcUsua(List<AlternativaBE> objAltMarcUsua) {
		this.ObjAltMarcUsua = objAltMarcUsua;
	}

}
