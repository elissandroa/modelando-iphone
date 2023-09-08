package com.digitalinovation.iphone.entities;

public class Musicas {

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
	public String toString() {
		return "Musicas [nome=" + nome + ", duracao=" + duracao + ", cantor=" + cantor + ", album=" + album + "]";
	}
	
}
