package AvalCampeonatoBrasileiro;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Tabela {
	
	//attributes
	public List<Time> times = new ArrayList<>();
	
	//methods
	public void addTime(Time time) {
		times.add(time);
	}
	
	//getters
	public Time getLider() {
		return this.times.get(0);
	}
	public Time getLanterna() {
		return this.times.get(times.size()-1);
	}
	
	public void imprimeTabela() {
		
		Collections.sort(times);
		
		System.out.println("Posição: / PTS: /   TIME:   / VIT: / EMP: / DER: / GP: / GC: / SG:\n");

		for (int i = 0; i < times.size(); i++) {
			
			Time time = times.get(i);
			System.out.println("   " + times.indexOf(time)+1 +"    /  "+time.getPontos()+"  / "+time.getNome()+" /   "+time.getVitorias()+"  /  "+time.getEmpates()+"  /  "+time.getDerrotas()+"  /  "+time.getGolsPro()+"  /  "+time.getGolsContra()+"  /  "+time.getSaldoDeGols());
		}
		
		System.out.println("\nLíder: "+ getLider().getNome()+"\nLanterna: "+getLanterna().getNome()+"\n");
		

	}

}