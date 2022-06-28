package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Tabela {
	
	//attributes
	public static List<Time> times = new ArrayList<>();
	
	//getters
	public static Time getLanterna() {
		return times.get(times.size()-1);
	}
	
	public static Time getLider() {
		return times.get(0);
	}
	
	//methods
	public static void addTime(Time time) {
		times.add(time);
	}
	
	public static void imprimeTabela() {
		
		System.out.println("Posição: / PTS: /    TIME:    / VIT: / EMP: / DER: / GP: / GC: / SG:\n");
			
		
		for (int i = 0; i < times.size(); i++) {
			
			Time time = times.get(i);
			System.out.println("    " + times.indexOf(time)+1+"     /   "+time.getPontos()+"   / "+time.getNome()+" /   "+time.getVitorias()+"   /   "+time.getEmpates()+"   /   "+time.getDerrotas()+"   /   "+time.getGolsPro()+"   /   "+time.getGolsContra()+"   /   "+time.getSaldoDeGols());
		}
		
		System.out.println("Líder: "+ getLider().getNome()+" Lanterna: "+getLanterna().getNome()+"\n");
		

	}

}
