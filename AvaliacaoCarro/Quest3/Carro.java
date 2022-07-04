package Quest3;
import java.util.Comparator;


public class Carro implements Comparable<Carro>{
	
	//attributes
	private String nome;
	private String marca;
	private String modelo;
	
	//constructor
	Carro(String nome, String marca, String modelo) {
		this.nome=nome;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	//getter
	public String getNome() {
		return this.nome;
	}
	
	//methods
	public int compareTo(Carro car) {
	    return this.nome.compareTo(car.getNome());
	}
	
	//toString
	@Override
	public String toString() {
		return this.nome + " (Marca: " + this.marca + "/Modelo: " + this.modelo + ")";
	}
}
