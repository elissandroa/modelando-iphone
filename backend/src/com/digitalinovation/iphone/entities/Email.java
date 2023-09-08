package com.digitalinovation.iphone.entities;

import java.util.HashSet;
import java.util.Set;

import com.digitalinovation.iphone.service.Aplicativos;
import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.ConectWifi;

public class Email implements Aplicativos {

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

	
	public void enviarEmail() {
		conectar();
		System.out.println("Enviando email para o contato:"+ this.contato.getNome() );
		fecharConexao();
	}

	
	public void receberEmail() {
		conectar();
		System.out.println("Recebendo email!");
		fecharConexao();
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


	
	public void fecharConexao() {
		System.out.println("Desconectando da Rede");
		System.out.println("Conexão Fechada !");
	}


	@Override
	public void abrir() {
		System.out.println("Abrindo cliente de Email");
		
	}


	@Override
	public void fechar() {
		System.out.println("Fechando cliente de Email");
		
	}


	@Override
	public void maximizar() {
		System.out.println("Maximizando cliente de Email");
	}


	@Override
	public void minimizar() {
		System.out.println("Minimizando cliente de Email");
	}
	
	@Override
	public String toString() {
		return "Email [contato=" + this.contato.getNome() + ", assunto=" + assunto + ", mensagem=" + mensagem + "]";
	}

}
