package CampeonatoBrasileiro;

public class Time {
	
	//attributes
	private String nome;
	private int pontos=0;
	private int jogos=0;
	private int vitoria=0;
	private int empate=0;
	private int derrota=0;
	private int golP=0;
	private int golContra=0;
	private int saldoGols=0;
	
	//constructor
	public Time (String nomeTime) {
		this.nome = nomeTime;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	public int getPontos() {
		return this.pontos;
	}
	public int getJogos() {
		return this.jogos;
	}
	public int getVitoria() {
		return this.vitoria;
	}
	public int getEmapate() {
		return this.empate;
	}
	public int getDerrota() {
		return this.derrota;
	}
	public int getGolP() {
		return this.golP;
	}
	public int getGolContra() {
		return this.golContra;
	}
	public int getSaldoGols() {
		return this.saldoGols;
	}
		
	//setters
	public void setVitoria(int vitoria, int gols) {
		this.vitoria += vitoria;
		this.golP = gols;
		this.saldoGols += gols;
		this.pontos += 3;
		this.jogos += 1;
	}
	public void setEmpate(int empate, int gols) {
		this.empate += empate;
		this.golP = gols;
		this.saldoGols += gols;
		this.pontos += 1;
		this.jogos += 1;
	}
	public void setDerrota(int derrota, int gols) {
		this.derrota += derrota;
		this.golP = gols;
		this.saldoGols += gols;
		this.pontos += 0;
		this.jogos += 1;
	}
	//methods
	

}
