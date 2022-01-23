package com.examenonline.bean;

import java.io.Serializable;

public class SuscripcionBE implements Serializable{

	public int idSuscripcion ;
    public String descripcion ;
    public double precio ;
    public int idTipoUsuario ;
    public TipoUsuarioBE tipoUsuario ;
    public boolean estado ;
    public String crea ;
    public String modifica ;
    public String elimina ;
    
    public SuscripcionBE() {
    	
    }

	public SuscripcionBE(int idSuscripcion, String descripcion, double precio, int idTipoUsuario,
			TipoUsuarioBE tipoUsuario, boolean estado, String crea, String modifica, String elimina) {
		super();
		this.idSuscripcion = idSuscripcion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.idTipoUsuario = idTipoUsuario;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
		this.crea = crea;
		this.modifica = modifica;
		this.elimina = elimina;
	}

	public int getIdSuscripcion() {
		return idSuscripcion;
	}

	public void setIdSuscripcion(int idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public TipoUsuarioBE getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioBE tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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
