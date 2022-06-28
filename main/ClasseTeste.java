package main;

public class ClasseTeste {
	
	public static void main (String [] args) {
		
		Time palmeiras = new Time("Palmeiras");
		Time flamengo = new Time("Flamengo");
		Jogo j1 = new Jogo (palmeiras, flamengo);
		j1.setResultado (3,2);
		Tabela tabela = new Tabela();
		Time lider = tabela.getLider();
		Time lanterna = tabela.getLanterna();
		
		System.out.println(palmeiras.getPontos());
		System.out.println(palmeiras.getGolsPro());
		Jogo j2 = new Jogo (palmeiras, flamengo);
		j1.setResultado (5,0);
		System.out.println(palmeiras.getPontos());
		System.out.println(palmeiras.getGolsPro());
		System.out.println(palmeiras.getSaldoDeGols());
		System.out.println(palmeiras.getJogos());
	}

}