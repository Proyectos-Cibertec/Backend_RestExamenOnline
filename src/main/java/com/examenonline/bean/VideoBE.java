package com.examenonline.bean;

import java.io.Serializable;

public class VideoBE implements Serializable{

	public int IdVideo ;
    public String Video ;
    public PreguntaBE Pregunta ;
    
    public VideoBE() {
    	
    }

	public VideoBE(int idVideo, String video, PreguntaBE pregunta) {
		super();
		this.IdVideo = idVideo;
		this.Video = video;
		this.Pregunta = pregunta;
	}

	public int getIdVideo() {
		return IdVideo;
	}

	public void setIdVideo(int idVideo) {
		this.IdVideo = idVideo;
	}

	public String getVideo() {
		return Video;
	}

	public void setVideo(String video) {
		this.Video = video;
	}

	public PreguntaBE getPregunta() {
		return Pregunta;
	}

	public void setPregunta(PreguntaBE pregunta) {
		this.Pregunta = pregunta;
	}
    
}
