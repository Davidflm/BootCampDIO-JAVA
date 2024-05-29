package DesafioPOO.Interfaces.Produto;

import DesafioPOO.Interfaces.AparelhoTelefonico;
import DesafioPOO.Interfaces.NavegadorInternet;
import DesafioPOO.Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("MUSICA TOCANDO");
		
	}

	@Override
	public void pausar() {
		System.out.println("MUSICA PAUSADA");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("MUSICA TOCANDO");
	}

	@Override
	public void exibirPagina() {
		System.out.println("PAGINA EM EXIBIÇÃO");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA CRIADA");
		
	}

	@Override
	public void ligar() {
		System.out.println("TELEFONE LIGANDO");
		
	}

	@Override
	public void atender() {
		System.out.println("LIGAÇÃO ATENDIDA");
		
	}

	@Override
	public void ouvirCorreioVoz() {
		System.out.println("OUVINDO CORREIO DE VOZ");
		
	}

}
