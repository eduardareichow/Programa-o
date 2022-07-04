package AvalCampeonatoBrasileiro;

public class Jogo {
	
	//attributes
	Time time1;
	Time time2;
	
	private final int VITORIA = 3;
	private final int EMPATE = 1;
	private final int DERROTA = 0;
	
	private int resultadoTime1;
	private int resultadoTime2;
	
	//constructor
	public Jogo (Time time1, Time time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	//getters
	public int getResultadoTime1() {
		return resultadoTime1;
	}
	public int getResultadoTime2() {
		return resultadoTime2;
	}

	//setters
	public void setResultado(int PtsTime1, int PtsTime2) {
		time1.addJogo(this);
		time2.addJogo(this);
		
		this.resultadoTime1 = PtsTime1;
		this.resultadoTime2 = PtsTime2;
		
		if (PtsTime1 > PtsTime2) {
			
			time1.addVitoria();
			time1.addPontos(VITORIA);
			time1.addGolsPro(PtsTime1);
			time1.addGolsContra(PtsTime2);
			time1.addSaldoGols(PtsTime1 - PtsTime2);
			
			time2.addDerrota();
			time2.addPontos(DERROTA);
			time2.addGolsPro(PtsTime2);
			time2.addGolsContra(PtsTime1);
			time2.addSaldoGols(PtsTime2 - PtsTime1);
			
		} else if  (PtsTime1 < PtsTime2) {
			
			time1.addDerrota();
			time1.addPontos(DERROTA);
			time1.addGolsPro(PtsTime1);
			time1.addGolsContra(PtsTime2);
			time1.addSaldoGols(PtsTime1 - PtsTime2);
			
			time2.addVitoria();
			time2.addPontos(VITORIA);
			time2.addGolsPro(PtsTime2);
			time2.addGolsContra(PtsTime1);
			time2.addSaldoGols(PtsTime2 - PtsTime1);
			
			
		} else if  (PtsTime1 == PtsTime2) {
			
			time1.addEmpate();
			time1.addPontos(EMPATE);
			time1.addGolsPro(PtsTime1);
			time1.addGolsContra(PtsTime2);
			time1.addSaldoGols(PtsTime1 - PtsTime2);
			
			time2.addEmpate();
			time2.addPontos(EMPATE);
			time2.addGolsPro(PtsTime2);
			time2.addGolsContra(PtsTime1);
			time2.addSaldoGols(PtsTime2 - PtsTime1);
		
		}
	}	

}