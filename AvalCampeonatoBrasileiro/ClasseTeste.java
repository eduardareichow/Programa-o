package AvalCampeonatoBrasileiro;

public class ClasseTeste {
	
	public static void main (String [] args) {
		
		Tabela tabela = new Tabela();
		Time palmeiras = new Time("Palmeiras");
		tabela.addTime(palmeiras);
		
		Time flamengo = new Time("Flamengo");
		tabela.addTime(flamengo);

		Jogo j1 = new Jogo (palmeiras, flamengo);
		j1.setResultado (3,2);
		
	
		
		
		Time lider = tabela.getLider();
		Time lanterna = tabela.getLanterna();
		
		System.out.println(palmeiras.getPontos());
		System.out.println(palmeiras.getGolsPro());
		Jogo j2 = new Jogo (palmeiras, flamengo);
		j1.setResultado (5,0);
		System.out.println(palmeiras.getPontos());
		System.out.println(palmeiras.getGolsPro());
		System.out.println(palmeiras.getSaldoDeGols());
		
		tabela.imprimeTabela();
	}

}