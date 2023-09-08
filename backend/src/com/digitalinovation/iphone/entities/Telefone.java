package com.digitalinovation.iphone.entities;

import java.util.HashSet;
import java.util.Set;

import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.RedeMovel;

public class Telefone implements RedeMovel{

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
		System.out.println("ligação em andamento ...");
	}
	
	public void fecharLigacao() {
		System.out.println("Encerrando ligação com o número: "+ this.numero);
		System.out.println("Ligação encerrada");
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

	@Override
	public void conectar() {
		System.out.println("Conectando a Rede");
		if(ConectRedeMovel.getInstance() != null) {
			System.out.println("Conectado via RedeMovel");
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
