package com.digitalinovation.iphone.entities;

import com.digitalinovation.iphone.service.Aplicativos;
import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.ConectWifi;

public class GoogleMaps implements Aplicativos {

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

	@Override
	public void conectar() {
		System.out.println("Conectando a Rede");
		if(ConectWifi.getInstance() != null) {
			System.out.println("Conectado via Wifi");
		} else if (ConectRedeMovel.getInstance() != null) {
			System.out.println("Conectado via rede Movel");
		} else {
			System.out.print("Falha de conexão !");
		}
	}

	@Override
	public void fecharConexao() {
		System.out.println("Desconectando da Rede");
		System.out.println("Conexão Fechada !");
	}

	@Override
	public void abrir() {
		conectar();
		System.out.println("Abrindo o Google Maps");
		
	}

	@Override
	public void fechar() {
		System.out.println("Fechando o Google Maps");
		fecharConexao();
		
	}

	@Override
	public void maximizar() {
		System.out.println("Maximizando o Google Maps");
		
	}

	@Override
	public void minimizar() {
		System.out.println("Minimizando o Google Maps");
		
	}
}
