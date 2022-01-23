package com.examenonline.bean;

import java.io.Serializable;

public class RespuestaBE implements Serializable{

	private String MensajeError ;
    private String MensajeException ;
    private int CodigoError ;
    private Boolean Registra ;
    private int IdExamenRealizado ;
    
    public RespuestaBE() {
    	
    }

	public RespuestaBE(String mensajeError, String mensajeException, int codigoError, Boolean registra,
			int idExamenRealizado) {
		super();
		this.MensajeError = mensajeError;
		this.MensajeException = mensajeException;
		this.CodigoError = codigoError;
		this.Registra = registra;
		this.IdExamenRealizado = idExamenRealizado;
	}

	public String getMensajeError() {
		return MensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.MensajeError = mensajeError;
	}

	public String getMensajeException() {
		return MensajeException;
	}

	public void setMensajeException(String mensajeException) {
		this.MensajeException = mensajeException;
	}

	public int getCodigoError() {
		return CodigoError;
	}

	public void setCodigoError(int codigoError) {
		this.CodigoError = codigoError;
	}

	public Boolean getRegistra() {
		return Registra;
	}

	public void setRegistra(Boolean registra) {
		this.Registra = registra;
	}

	public int getIdExamenRealizado() {
		return IdExamenRealizado;
	}

	public void setIdExamenRealizado(int idExamenRealizado) {
		this.IdExamenRealizado = idExamenRealizado;
	}
            
}
