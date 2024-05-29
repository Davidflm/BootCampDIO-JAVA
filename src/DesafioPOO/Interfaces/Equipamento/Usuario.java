package DesafioPOO.Interfaces.Equipamento;

import DesafioPOO.Interfaces.Produto.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		System.out.println("Funções da Interface AparelhoTelefonico");
		iphone.ligar();
		iphone.atender();
		iphone.ouvirCorreioVoz();
		
		System.out.println("\nFunções da Interface NavegadorInternet");
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		
		System.out.println("\nFunções da Interface ReprodutorMusical");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
	}
}
