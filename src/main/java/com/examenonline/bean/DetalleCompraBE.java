package com.examenonline.bean;

import java.io.Serializable;
import java.util.Date;

public class DetalleCompraBE implements Serializable{

	private int idDetalleCompra ;
	private int idCompra ;
    private int idSuscripcion ;
    private int cantidadMeses ;
    private double precioPorMes ;
    private Date fechaExpiracion ;
    private boolean estado ; // 0: Ya expiró | 1: No expira
	private String descSus;
    
    public DetalleCompraBE() {
    	
    }

	public DetalleCompraBE(int idDetalleCompra, int idCompra, int idSuscripcion, int cantidadMeses, double precioPorMes,
			Date fechaExpiracion, boolean estado, String descSus) {
		super();
		this.idDetalleCompra = idDetalleCompra;
		this.idCompra = idCompra;
		this.idSuscripcion = idSuscripcion;
		this.cantidadMeses = cantidadMeses;
		this.precioPorMes = precioPorMes;
		this.fechaExpiracion = fechaExpiracion;
		this.estado = estado;
		this.descSus = descSus;
	}

	public int getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(int idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getIdSuscripcion() {
		return idSuscripcion;
	}

	public void setIdSuscripcion(int idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}

	public int getCantidadMeses() {
		return cantidadMeses;
	}

	public void setCantidadMeses(int cantidadMeses) {
		this.cantidadMeses = cantidadMeses;
	}

	public double getPrecioPorMes() {
		return precioPorMes;
	}

	public void setPrecioPorMes(double precioPorMes) {
		this.precioPorMes = precioPorMes;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getDescSus() {
		return descSus;
	}

	public void setDescSus(String descSus) {
		this.descSus = descSus;
	}

    
	
}
