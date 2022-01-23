package com.examenonline.bean;

import java.io.Serializable;
import java.util.List;

public class PreguntaBE implements Serializable{

	public int IdPregunta ;
    public String Pregunta ;
    public int Numero ;
    public ExamenBE Examen ;

    public List<ImagenBE> LstImagen ;
    public List<VideoBE> LstVideo ;
    public List<AlternativaBE> LstAlternativa ;
    public List<AlternativaBE> LstAlternativaCorrecta ;
    
	public PreguntaBE() {
		
	}

	public PreguntaBE(int idPregunta, String pregunta, int numero, ExamenBE examen, List<ImagenBE> lstImagen,
			List<VideoBE> lstVideo, List<AlternativaBE> lstAlternativa, List<AlternativaBE> lstAlternativaCorrecta) {
		super();
		this.IdPregunta = idPregunta;
		this.Pregunta = pregunta;
		this.Numero = numero;
		this.Examen = examen;
		this.LstImagen = lstImagen;
		this.LstVideo = lstVideo;
		this.LstAlternativa = lstAlternativa;
		this.LstAlternativaCorrecta = lstAlternativaCorrecta;
	}

	public int getIdPregunta() {
		return IdPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.IdPregunta = idPregunta;
	}

	public String getPregunta() {
		return Pregunta;
	}

	public void setPregunta(String pregunta) {
		this.Pregunta = pregunta;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		this.Numero = numero;
	}

	public ExamenBE getExamen() {
		return Examen;
	}

	public void setExamen(ExamenBE examen) {
		this.Examen = examen;
	}

	public List<ImagenBE> getLstImagen() {
		return LstImagen;
	}

	public void setLstImagen(List<ImagenBE> lstImagen) {
		this.LstImagen = lstImagen;
	}

	public List<VideoBE> getLstVideo() {
		return LstVideo;
	}

	public void setLstVideo(List<VideoBE> lstVideo) {
		this.LstVideo = lstVideo;
	}

	public List<AlternativaBE> getLstAlternativa() {
		return LstAlternativa;
	}

	public void setLstAlternativa(List<AlternativaBE> lstAlternativa) {
		this.LstAlternativa = lstAlternativa;
	}

	public List<AlternativaBE> getLstAlternativaCorrecta() {
		return LstAlternativaCorrecta;
	}

	public void setLstAlternativaCorrecta(List<AlternativaBE> lstAlternativaCorrecta) {
		this.LstAlternativaCorrecta = lstAlternativaCorrecta;
	}
	
}
