package com.examenonline.bean;

import java.io.Serializable;

public class AsignaturaBE implements Serializable {

	public int IdAsignatura;
	public String Nombre;
	public boolean Estado;

	public AsignaturaBE() {

	}

	public AsignaturaBE(int idAsignatura, String nombre, boolean estado) {
		super();
		this.IdAsignatura = idAsignatura;
		this.Nombre = nombre;
		this.Estado = estado;
	}

	public int getIdAsignatura() {
		return IdAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.IdAsignatura = idAsignatura;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		this.Estado = estado;
	}

}
