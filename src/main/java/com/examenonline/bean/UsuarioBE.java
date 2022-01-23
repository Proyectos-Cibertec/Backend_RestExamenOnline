package com.examenonline.bean;

import java.io.Serializable;
import java.util.Date;

public class UsuarioBE implements Serializable {

	public int IdUsuario;
	public String Nombres;
	public String ApellidoPaterno;
	public String ApellidoMaterno;
	public String Correo;
	public String Dni;
	public String Usuario;
	public String Contraseña;
	public String Contrasenia;
	public Date FechaRegistro;
	public int Intentos;
	public boolean Bloqueado;
	public TipoUsuarioBE TipoUsuario;
	public String NombreCompleto;
	public boolean Estado;
	public String Crea;
	public String Modifica;
	public String Elimina;
	// public HttpPostedFileBase imgUsuario ;
	public String imgData;
	public String imgUsuario;

	// Para categoria
	public RolBE Rol;

	public UsuarioBE() {

	}

	public UsuarioBE(int idUsuario, String nombres, String apellidoPaterno, String apellidoMaterno, String correo,
			String dni, String usuario, String contraseña, String contrasenia, Date fechaRegistro, int intentos,
			boolean bloqueado, TipoUsuarioBE tipoUsuario, String nombreCompleto, boolean estado, String crea,
			String modifica, String elimina, String imgData, RolBE rol) {
		super();
		this.IdUsuario = idUsuario;
		this.Nombres = nombres;
		this.ApellidoPaterno = apellidoPaterno;
		this.ApellidoMaterno = apellidoMaterno;
		this.Correo = correo;
		this.Dni = dni;
		this.Usuario = usuario;
		this.Contraseña = contraseña;
		this.Contrasenia = contrasenia;
		this.FechaRegistro = fechaRegistro;
		this.Intentos = intentos;
		this.Bloqueado = bloqueado;
		this.TipoUsuario = tipoUsuario;
		this.NombreCompleto = nombreCompleto;
		this.Estado = estado;
		this.Crea = crea;
		this.Modifica = modifica;
		this.Elimina = elimina;
		this.imgData = imgData;
		this.Rol = rol;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.IdUsuario = idUsuario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}

	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.ApellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.ApellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		this.Correo = correo;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		this.Dni = dni;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		this.Usuario = usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		this.Contraseña = contraseña;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.Contrasenia = contrasenia;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.FechaRegistro = fechaRegistro;
	}

	public int getIntentos() {
		return Intentos;
	}

	public void setIntentos(int intentos) {
		this.Intentos = intentos;
	}

	public boolean isBloqueado() {
		return Bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.Bloqueado = bloqueado;
	}

	public TipoUsuarioBE getTipoUsuario() {
		return TipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioBE tipoUsuario) {
		this.TipoUsuario = tipoUsuario;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.NombreCompleto = nombreCompleto;
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

	public String getImgData() {
		return imgData;
	}

	public void setImgData(String imgData) {
		this.imgData = imgData;
	}

	public RolBE getRol() {
		return Rol;
	}

	public void setRol(RolBE rol) {
		this.Rol = rol;
	}

	public String getImgUsuario() {
		return imgUsuario;
	}

	public void setImgUsuario(String imgUsuario) {
		this.imgUsuario = imgUsuario;
	}
}
