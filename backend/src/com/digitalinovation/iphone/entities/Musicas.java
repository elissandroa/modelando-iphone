package com.digitalinovation.iphone.entities;

import com.digitalinovation.iphone.service.Aplicativos;
import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.ConectWifi;
import com.digitalinovation.iphone.service.Player;

public class Musicas implements Player, Aplicativos{

	private String nome;
	private Double duracao;
	private String cantor;
	private String album;
	
	public Musicas() {
	}

	public Musicas(String nome, Double duracao, String cantor, String album) {
		this.nome = nome;
		this.duracao = duracao;
		this.cantor = cantor;
		this.album = album;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	
	@Override
	public void tocar() {
		System.out.println("Tocando a música: "+ this.getNome());
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");
		
	}

	@Override
	public void porEmEspera() {
		pausar();
		System.out.println("Múscia em espera");
		
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
		System.out.println("Abrir player de Musica");
		conectar();
		System.out.println("Abrindo player de músicas");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando player de músicas");
		System.out.println("Player fechado");
		
	}

	@Override
	public void maximizar() {
		System.out.println("Maximizando player de múscias");
		
	}

	@Override
	public void minimizar() {
		System.out.println("Minimizando player de músicas");
		
	}
	
	@Override
	public String toString() {
		return "Musicas [nome=" + nome + ", duracao=" + duracao + ", cantor=" + cantor + ", album=" + album + "]";
	}
	
}
