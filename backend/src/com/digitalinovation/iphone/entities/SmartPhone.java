package com.digitalinovation.iphone.entities;

public class SmartPhone {

	private String memoria;
	private String modelo;
	private String numeroSerie;
	
	public SmartPhone() {
	}

	public SmartPhone(String memoria, String modelo, String numeroSerie) {
		this.memoria = memoria;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	@Override
	public String toString() {
		return "SmartPhone [memoria=" + memoria + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + "]";
	}

}
