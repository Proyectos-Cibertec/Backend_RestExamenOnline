package com.examenonline.bean;

import java.io.Serializable;

public class ExamenRealizadoDetalleBE implements Serializable{

	public int idExamenRealizadoDetalle ;
    public int idExamenRealizado ;
    public int idPregunta ;
    public int idAlternativa ;
    
	public ExamenRealizadoDetalleBE() {
		
	}

	public ExamenRealizadoDetalleBE(int idExamenRealizadoDetalle, int idExamenRealizado, int idPregunta,
			int idAlternativa) {
		super();
		this.idExamenRealizadoDetalle = idExamenRealizadoDetalle;
		this.idExamenRealizado = idExamenRealizado;
		this.idPregunta = idPregunta;
		this.idAlternativa = idAlternativa;
	}

	public int getIdExamenRealizadoDetalle() {
		return idExamenRealizadoDetalle;
	}

	public void setIdExamenRealizadoDetalle(int idExamenRealizadoDetalle) {
		this.idExamenRealizadoDetalle = idExamenRealizadoDetalle;
	}

	public int getIdExamenRealizado() {
		return idExamenRealizado;
	}

	public void setIdExamenRealizado(int idExamenRealizado) {
		this.idExamenRealizado = idExamenRealizado;
	}

	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public int getIdAlternativa() {
		return idAlternativa;
	}

	public void setIdAlternativa(int idAlternativa) {
		this.idAlternativa = idAlternativa;
	}
	
}
