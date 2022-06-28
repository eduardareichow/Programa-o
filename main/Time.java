package main;
import java.util.ArrayList;

public class Time {

	//attributes
	private String nome;
	private ArrayList<Jogo> jogo = new ArrayList<Jogo>();
	private int PTS = 0,
				VIT = 0,
				E = 0,
				DER = 0,
				GP = 0,
				GC = 0,
				SG = 0;
	
	//constructor
	public Time (String nome) {
		this.nome = nome;
	}
	public Time (String nome, int PTS) {
		this.nome = nome;
		this.PTS = PTS;
	}
	
	//getters
	public int getPontos() {
		return this.PTS;
	}
	public ArrayList<Jogo> getJogos() {
		return this.jogo;
	}
	public int getVitorias() {
		return this.VIT;
	}
	public int getEmpates() {
		return this.E;
	}
	public int getDerrotas() {
		return this.DER;
	}
	public int getGolsPro() {
		return this.GP;
	}
	public int getGolsContra() {
		return this.GC;
	}
	public int getSaldoDeGols() {
		return this.SG;
	}
	public String getNome() {
		return this.nome;
	}
	
	//methods
	public void addPontos (int pts) {
		this.PTS += pts;
	}
	public void addJogo (Jogo j) {
		this.jogo.add(j);
	}
	public void addVitoria() {
		this.VIT++;
	}
	public void addEmpate() {
		this.E++;
	}
	public void addDerrota() {
		this.DER++;
	}
	public void addGolsPro(int gp) {
		this.GP += gp;
	}
	public void addGolsContra(int gc) {
		this.GC += gc;
	}
	public void addSaldoGols(int sg) {
		this.SG += sg;
	}
	
}
