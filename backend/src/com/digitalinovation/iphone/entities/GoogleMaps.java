package com.digitalinovation.iphone.entities;

public class GoogleMaps {

	private String endereco;
	private Boolean imagemGrafico;
	private Boolean imagemSatelite;

	public GoogleMaps() {
	}

	public GoogleMaps(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Boolean getImagemGrafico() {
		return imagemGrafico;
	}

	public void setImagemGrafico(Boolean imagemGrafico) {
		this.imagemGrafico = imagemGrafico;
	}

	public Boolean getImagemSatelite() {
		return imagemSatelite;
	}

	public void setImagemSatelite(Boolean imagemSatelite) {
		this.imagemSatelite = imagemSatelite;
	}

	public void zoomUp(){
		System.out.println("Aumentando o zoom!");
	}
	
	public void zoomDown(){
		System.out.println("Diminuindo o zoom!");
	}
}
