package Aula_11_04;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<CD> cd = new ArrayList<CD>();
	private ArrayList<DVD> dvd = new ArrayList<DVD>();
	
	public ArrayList<CD> CD(){
		return this.cd;
	}
	public ArrayList<DVD> DVD(){
		return this.dvd;
	}
}