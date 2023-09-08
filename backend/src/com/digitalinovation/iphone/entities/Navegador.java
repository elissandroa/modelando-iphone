package com.digitalinovation.iphone.entities;

import com.digitalinovation.iphone.service.Aplicativos;
import com.digitalinovation.iphone.service.ConectRedeMovel;
import com.digitalinovation.iphone.service.ConectWifi;

public class Navegador implements Aplicativos {

	private String nome;
	private String versao;
	
	public Navegador() {
	}

	public Navegador(String nome, String versao) {
		this.nome = "Safari";
		this.versao = "1.0";
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

	public void irParaPagina(String endereco) {
		System.out.println("Navengando para a página: "+endereco);
		System.out.println("Carregando página ...");
		System.out.println("Página carregada");
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
		System.out.println("Navegador");
		conectar();
		System.out.println("Abrindo navegador: "+this.nome);
	}

	@Override
	public void fechar() {
		fecharConexao();
		System.out.println("Fechando navegador: "+this.nome);
	}

	@Override
	public void maximizar() {
		System.out.println("Maximizando navegador: "+ this.nome);
		
	}

	@Override
	public void minimizar() {
		System.out.println("Minimizando navegador: "+this.nome);
		
	}

}
