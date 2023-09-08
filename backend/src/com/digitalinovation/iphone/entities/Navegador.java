package com.digitalinovation.iphone.entities;

public class Navegador {

	private String nome;
	private String versao;
	private String endereco;
	
	public Navegador() {
	}

	public Navegador(String nome, String versao, String endereco) {
		this.nome = "Safari";
		this.versao = "1.0";
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void irParaPagina(String endereco) {
		System.out.println("Navengando para a página: "+endereco);
	}

}
