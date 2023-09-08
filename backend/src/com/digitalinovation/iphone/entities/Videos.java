package com.digitalinovation.iphone.entities;

import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.ConectWifi;
import com.digitalinovation.iphone.service.Player;

public class Videos implements Player {

	private String nome;
	private String duracao;
	private String capa;
	
	public Videos() {
	}

	public Videos(String nome, String duracao, String capa) {
		this.nome = nome;
		this.duracao = duracao;
		this.capa = capa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "Videos [nome=" + nome + ", duracao=" + duracao + ", capa=" + capa + "]";
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo vídeo");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando vídeo");
		
	}

	@Override
	public void porEmEspera() {
		pausar();
		System.out.println("Video em espera");
		
	}

	@Override
	public void abrir() {
		conectar();
		System.out.println("Abrindo player de Vídeos");
		
	}

	@Override
	public void fechar() {
		System.out.println("Fechando player de Vídeos");
		fecharConexao();
		
	}

	@Override
	public void maximizar() {
		System.out.println("Maximizando player de vídeos");
		
	}

	@Override
	public void minimizar() {
		System.out.println("Minimizando player de vídeos");
		
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
	
	
	
}
