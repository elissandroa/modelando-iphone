package com.digitalinovation.iphone.entities;

public class Videos {

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
	
	
	
}
