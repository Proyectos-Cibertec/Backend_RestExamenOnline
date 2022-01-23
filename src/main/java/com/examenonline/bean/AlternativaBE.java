package com.examenonline.bean;

import java.io.Serializable;

public class AlternativaBE implements Serializable {

	public int IdAlternativa;
	public PreguntaBE Pregunta;
	public int Numero;
	public String Descripcion;
	public boolean OpcionCorrecta;
	public int CantAltCorrectas;

	public AlternativaBE() {
		super();
	}

	public AlternativaBE(int idAlternativa, PreguntaBE pregunta, int numero, String descripcion, boolean opcionCorrecta,
			int cantAltCorrectas) {
		super();
		IdAlternativa = idAlternativa;
		Pregunta = pregunta;
		Numero = numero;
		Descripcion = descripcion;
		OpcionCorrecta = opcionCorrecta;
		CantAltCorrectas = cantAltCorrectas;
	}

	public int getIdAlternativa() {
		return IdAlternativa;
	}

	public void setIdAlternativa(int idAlternativa) {
		IdAlternativa = idAlternativa;
	}

	public PreguntaBE getPregunta() {
		return Pregunta;
	}

	public void setPregunta(PreguntaBE pregunta) {
		Pregunta = pregunta;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public boolean isOpcionCorrecta() {
		return OpcionCorrecta;
	}

	public void setOpcionCorrecta(boolean opcionCorrecta) {
		OpcionCorrecta = opcionCorrecta;
	}

	public int getCantAltCorrectas() {
		return CantAltCorrectas;
	}

	public void setCantAltCorrectas(int cantAltCorrectas) {
		CantAltCorrectas = cantAltCorrectas;
	}

}
