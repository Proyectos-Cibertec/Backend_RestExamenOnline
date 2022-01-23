package com.examenonline.bean;

import java.io.Serializable;

public class EnlaceBE implements Serializable{

	public int idEnlace ;
    public String nombreEnlace ;
    public String urlEnlace ;
    public String enlaceIcono ;
    public boolean estado ;
    public String crea ;
    public String modifica ;
    public String elimina ;
	
	public EnlaceBE() {
		
	}

	public EnlaceBE(int idEnlace, String nombreEnlace, String urlEnlace, String enlaceIcono, boolean estado,
			String crea, String modifica, String elimina) {
		super();
		this.idEnlace = idEnlace;
		this.nombreEnlace = nombreEnlace;
		this.urlEnlace = urlEnlace;
		this.enlaceIcono = enlaceIcono;
		this.estado = estado;
		this.crea = crea;
		this.modifica = modifica;
		this.elimina = elimina;
	}

	public int getIdEnlace() {
		return idEnlace;
	}

	public void setIdEnlace(int idEnlace) {
		this.idEnlace = idEnlace;
	}

	public String getNombreEnlace() {
		return nombreEnlace;
	}

	public void setNombreEnlace(String nombreEnlace) {
		this.nombreEnlace = nombreEnlace;
	}

	public String getUrlEnlace() {
		return urlEnlace;
	}

	public void setUrlEnlace(String urlEnlace) {
		this.urlEnlace = urlEnlace;
	}

	public String getEnlaceIcono() {
		return enlaceIcono;
	}

	public void setEnlaceIcono(String enlaceIcono) {
		this.enlaceIcono = enlaceIcono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	public String getModifica() {
		return modifica;
	}

	public void setModifica(String modifica) {
		this.modifica = modifica;
	}

	public String getElimina() {
		return elimina;
	}

	public void setElimina(String elimina) {
		this.elimina = elimina;
	}

}
