package com.examenonline.bean;

import java.io.Serializable;

public class CategoriaBE implements Serializable {

	public int IdCategoria;
	public String NombreCategoria;
	public String IconoCategoria;
	public String UrlCategoria;
	public RolBE Rol;
	public boolean Estado;
	public String Crea;
	public String Modifica;
	public String Elimina;

	public CategoriaBE() {

	}

	public CategoriaBE(int idCategoria, String nombreCategoria, String iconoCategoria, String urlCategoria, RolBE rol,
			boolean estado, String crea, String modifica, String elimina) {
		super();
		this.IdCategoria = idCategoria;
		this.NombreCategoria = nombreCategoria;
		this.IconoCategoria = iconoCategoria;
		this.UrlCategoria = urlCategoria;
		this.Rol = rol;
		this.Estado = estado;
		this.Crea = crea;
		this.Modifica = modifica;
		this.Elimina = elimina;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.IdCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return NombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.NombreCategoria = nombreCategoria;
	}

	public String getIconoCategoria() {
		return IconoCategoria;
	}

	public void setIconoCategoria(String iconoCategoria) {
		this.IconoCategoria = iconoCategoria;
	}

	public String getUrlCategoria() {
		return UrlCategoria;
	}

	public void setUrlCategoria(String urlCategoria) {
		this.UrlCategoria = urlCategoria;
	}

	public RolBE getRol() {
		return Rol;
	}

	public void setRol(RolBE rol) {
		this.Rol = rol;
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
