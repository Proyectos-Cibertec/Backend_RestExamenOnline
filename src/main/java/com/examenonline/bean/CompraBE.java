package com.examenonline.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CompraBE implements Serializable{

	private int idCompra ;
	private int idUsuario ;
    private double total ;
    private Date fechaCompra ;
    private List<DetalleCompraBE> lstDetalleCompra ;
    
    public CompraBE() {
    	
    }

	public CompraBE(int idCompra, int idUsuario, double total, Date fechaCompra,
			List<DetalleCompraBE> lstDetalleCompra) {
		super();
		this.idCompra = idCompra;
		this.idUsuario = idUsuario;
		this.total = total;
		this.fechaCompra = fechaCompra;
		this.lstDetalleCompra = lstDetalleCompra;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<DetalleCompraBE> getLstDetalleCompra() {
		return lstDetalleCompra;
	}

	public void setLstDetalleCompra(List<DetalleCompraBE> lstDetalleCompra) {
		this.lstDetalleCompra = lstDetalleCompra;
	}

    
    
}
