package com.examenonline.bean;

import java.io.Serializable;

public class ImagenBE implements Serializable{

	public int IdImagen ;
    public String Imagen ;
    public PreguntaBE Pregunta ;
    
	public ImagenBE() {
		
	}

	public ImagenBE(int idImagen, String imagen, PreguntaBE pregunta) {
		super();
		this.IdImagen = idImagen;
		this.Imagen = imagen;
		this.Pregunta = pregunta;
	}

	public int getIdImagen() {
		return IdImagen;
	}

	public void setIdImagen(int idImagen) {
		this.IdImagen = idImagen;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		this.Imagen = imagen;
	}

	public PreguntaBE getPregunta() {
		return Pregunta;
	}

	public void setPregunta(PreguntaBE pregunta) {
		this.Pregunta = pregunta;
	}

	
	
	
    
}
