package com.examenonline.bean;

import java.io.Serializable;

public class TipoUsuarioBE implements Serializable{

	public int IdTipoUsuario ;
    public String Descripcion ;
    public boolean Estado ;
    public String Crea ;
    public String Modifica ;
    public String Elimina ;
    
	public TipoUsuarioBE() {
		
	}

	public TipoUsuarioBE(int idTipoUsuario, String descripcion, boolean estado, String crea, String modifica,
			String elimina) {
		super();
		this.IdTipoUsuario = idTipoUsuario;
		this.Descripcion = descripcion;
		this.Estado = estado;
		this.Crea = crea;
		this.Modifica = modifica;
		this.Elimina = elimina;
	}

	public int getIdTipoUsuario() {
		return IdTipoUsuario;
	}

	public void setIdTipoUsuario(int idTipoUsuario) {
		this.IdTipoUsuario = idTipoUsuario;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
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
