package CampeonatoBrasileiro;

public class Jogo {
	
	
	//attributes
	private Time timeUm;
	private Time timeDois;
	int GolContraTimeUm;
	int GolContraTimeDois;
	
	//constructor
	public Jogo (Time time1, Time time2) {
		
		this.timeUm = time1;
		this.timeDois = time2;
	}
	
	//methods
	public int[] resultado = new int[2];
	
	//setters
	public void setResultado(int resultadoTimeUm, int resultadoTimeDois){
		this.resultado[0] = resultadoTimeUm;
		this.resultado[1] = resultadoTimeDois;
		
		//time um ganha
		if (resultadoTimeUm > resultadoTimeDois) {
			
			timeUm.setVitoria(1, resultadoTimeUm);
			timeDois.setDerrota(1, resultadoTimeDois);
			
		}
		//time dois ganha
		else if (resultadoTimeUm < resultadoTimeDois) {
			
			timeUm.setDerrota(1, resultadoTimeUm);
			timeDois.setVitoria(1, resultadoTimeDois);
			
		} 
		// times empatam
		else if (resultadoTimeUm == resultadoTimeDois) {
			
			timeUm.setEmpate(1, resultadoTimeUm);
			timeDois.setEmpate(1, resultadoTimeDois);
		}
	}
	
	//public
}
