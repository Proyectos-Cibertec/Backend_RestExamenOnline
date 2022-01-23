package com.examenonline.bean;

import java.io.Serializable;

public class TipoExamenBE implements Serializable{

	public int IdTipoExamen ;
    public String Descripcion ;
    public int MaxPreguntas ;
    
    public TipoExamenBE() {
    	
    }

	public TipoExamenBE(int idTipoExamen, String descripcion, int maxPreguntas) {
		super();
		this.IdTipoExamen = idTipoExamen;
		this.Descripcion = descripcion;
		this.MaxPreguntas = maxPreguntas;
	}

	public int getIdTipoExamen() {
		return IdTipoExamen;
	}

	public void setIdTipoExamen(int idTipoExamen) {
		this.IdTipoExamen = idTipoExamen;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	public int getMaxPreguntas() {
		return MaxPreguntas;
	}

	public void setMaxPreguntas(int maxPreguntas) {
		this.MaxPreguntas = maxPreguntas;
	}
    
    
	
}
