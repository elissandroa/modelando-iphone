package com.digitalinovation.iphone.entities;

import java.util.HashSet;
import java.util.Set;

public class Email {

	private Contato contato;
	private String assunto;
	private String mensagem;
	
	public Email(Contato contato, String assunto, String mensagem) {
		this.contato = contato;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}
	
	private Set<Contato> contatos = new HashSet<>();

	public Email() {
	}
	
		
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Set<Contato> getContatos() {
		return contatos;
	}

	public void receber() {
		System.out.println("Recebendo email ...");
		System.out.println("Email recebido!");
	}
	
	public void enviar() {
		System.out.println("Enviando email ...");
		System.out.println("Email enviado!");
	}
	
	@Override
	public String toString() {
		return "Email [contato=" + contato + ", assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}

}
