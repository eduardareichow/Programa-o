package Aula_11_04;

import java.time.LocalTime;

public class CD {
		
		//attributes
		private String titulo;
		private String artista;
		private int numeroFaixa;
		private LocalTime duracao;
		
		//constructor
		public CD(String titulo, String artista, int numFaixa, int horas, int minutos, int segundos) {
			this.titulo=titulo;
			this.artista=artista;
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
		public String getArtista() {
			return this.artista;
		}
		public void setArtista(String a){
			this.artista = a;
		}
		public String ImprimirLista() {
			return "Nome: " + this.titulo + "\nArtista: " + this.artista + "/nNúmero da faixa: " + this.numeroFaixa + "/nDuração: " + this.duracao;
		}

}
