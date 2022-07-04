package Aula_11_04;
import java.time.LocalTime;

public class DVD {
		
	//attributes
	private String titulo;
	private String diretor;
	private int numeroFaixa;
	private LocalTime duracao;
		
	//constructor
	public DVD(String titulo, String diretor, int numFaixa, int horas, int minutos, int segundos) {
		this.titulo=titulo;
		this.diretor=diretor;
		this.numeroFaixa=numFaixa;
		this.duracao = LocalTime.of(horas, minutos, segundos);
	}
		
	//getter and setter
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String t){
		this.titulo = t;
	}
	public String getDiretor() {
		return this.diretor;
	}
	public void setDiretor(String d){
		this.diretor = d;
	}
	public String ImprimirLista() {
		return "Nome: " + this.titulo + "\nDiretor: " + this.diretor + "/nNúmero da faixa: " + this.numeroFaixa + "/nDuração: " + this.duracao;
	}
}