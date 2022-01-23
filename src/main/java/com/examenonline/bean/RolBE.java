package com.examenonline.bean;

import java.io.Serializable;

public class RolBE implements Serializable{

	public int IdRol ;
    public String NombreRol ;
    public boolean Estado ;
    public String Crea ;
    public String Modifica ;
    public String Elimina ;
    
    public RolBE() {
    	
    }

	public RolBE(int idRol, String nombreRol, boolean estado, String crea, String modifica, String elimina) {
		super();
		this.IdRol = idRol;
		this.NombreRol = nombreRol;
		this.Estado = estado;
		this.Crea = crea;
		this.Modifica = modifica;
		this.Elimina = elimina;
	}

	public int getIdRol() {
		return IdRol;
	}

	public void setIdRol(int idRol) {
		this.IdRol = idRol;
	}

	public String getNombreRol() {
		return NombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.NombreRol = nombreRol;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

	public String getCrea() {
		return Crea;
	}

	public void setCrea(String crea) {
		this.Crea = crea;
	}

	public String getModifica() {
		return Modifica;
	}

	public void setModifica(String modifica) {
		this.Modifica = modifica;
	}

	public String getElimina() {
		return Elimina;
	}

	public void setElimina(String elimina) {
		this.Elimina = elimina;
	}
    
}
