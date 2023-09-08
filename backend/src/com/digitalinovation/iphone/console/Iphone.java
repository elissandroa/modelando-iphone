package com.digitalinovation.iphone.console;

import java.util.ArrayList;
import java.util.List;

import com.digitalinovation.iphone.entities.Contato;
import com.digitalinovation.iphone.entities.Email;
import com.digitalinovation.iphone.entities.GoogleMaps;
import com.digitalinovation.iphone.entities.Musicas;
import com.digitalinovation.iphone.entities.Navegador;
import com.digitalinovation.iphone.entities.Telefone;
import com.digitalinovation.iphone.entities.Videos;

public class Iphone {

	public static void main(String[] args) {
		System.out.println("***************    Bem vindo ao seu Iphone!     *************");
		System.out.println("*************************************************************");
		Telefone ligacao1 = new Telefone(30239545);
		ligacao1.fazerLigacao();
		
		List<Contato> contatos = new ArrayList<>();
		
		Contato contato1 = new Contato("João da Silva", "2325-9341", "9568-2548", "joaosilva@gmail.com");
		Contato contato2 = new Contato("Miguel Paiva", "4536-1235", "8667-1543", "miguelpaiva@gmail.com");
		Contato contato3 = new Contato("Catarina Souza", "3345-2854", "7263-3528", "catarinaSouza@gmail.com");
		Contato contato4 = new Contato("Jaquelie Gonçalves", "3025-9548", "9599-4343", "jaquegoncalves@gmail.com");
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		Email email1 = new Email(contato1,"Nota fiscal","Segue os dados da Nota Fiscal 2345 valor R$ 180,00");
		email1.enviarEmail();
		Email email2 = new Email(contato4,"Hora do Almoço,","Vamos almoçar juntos hoje, te espero");
		System.out.println(email1);
		email2.enviarEmail();
		System.out.println(email2);
		
		GoogleMaps map1 = new GoogleMaps("Avenida Xv de novembro, Curitiba");
		GoogleMaps map2 = new GoogleMaps("Estátua Cristo Redentor, Rio de Janeiro");
		map1.abrir();
		map1.zoomUp();
		map2.abrir();
		map2.zoomDown();
		
		Musicas musica1 = new Musicas("We Will Rock You",2.14,"Queen", "News of the World");
		musica1.abrir();
		musica1.tocar();
		musica1.pausar();
		musica1.fechar();
		
		Navegador site1 = new Navegador("Safari","1.0");
		site1.abrir();
		site1.irParaPagina("http://www.gio.me");
		site1.fechar();
		
		
		Videos video1 = new Videos("Apresentação do Iphone", "1:08:20", "Padrão Youtube");
		video1.abrir();
		video1.tocar();
		video1.fechar();
	}

}
