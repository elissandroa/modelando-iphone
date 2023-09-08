package com.digitalinovation.iphone.entities;

import java.util.HashSet;
import java.util.Set;

public class Telefone {

	private Integer numero;
	private Contato contato;
	
	private Set<Contato>contatos = new HashSet<>();
	
	

	public Telefone() {
	}

	public Telefone(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Set<Contato> getContatos() {
		return contatos;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
		
	public void atender() {
		System.out.println("Atendendo a chamada!");
		System.out.println("Chamada em andamento!");
	}
	
	public void fazerLigacao() {
		System.out.println("Ligando para o número:" + this.numero);
	}
	
	public void chamadaPrivada() {
		System.out.println("chamadaPrivada!");
	}
	
	public void  modoConferencia() {
		System.out.println("Modo conferência!");
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}


}
