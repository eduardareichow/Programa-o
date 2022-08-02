package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import util.ValidaCPF;

/**
 *
 * @author Edson
 */
public class Pessoa {
 
	private String cpf;
	 
	private String nome;
	 
	private String sexo;
	 
	private Calendar dataNascimento;
        
        private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	 /**
      * Cria um objeto pessoa, inicializando os atributos com os valores passado por parametro.
      * @param cpf
      * @param nome
      * @param dataNascimento
      * @param sexo
      * @throws IllegalArgumentException - se o valor passado por parametro não for masculino ou feminino
      * @throws NullPointerException se o String rg, String nome ou o String dataNascimento passados por parametro forem nulos.
      */
	public Pessoa(String cpf, String nome, String dataNascimento, String sexo) {
            setDataNascimento(dataNascimento);
            setNome(nome);
            setCpf(cpf);
            setSexo(sexo);
	}
        
        public Pessoa(){
        
        }
	 /**
      * Obtem o conteudo do atributo nome.
      * @return
      */
	public String getNome() {
            return nome;
	}
	 /**
      * Altera o atributo nome
      * @param nome
      * @throws NullPointerException se o String nome passado por parametro for nulo.
      */
	public void setNome(String nome) {
            this.nome=nome;
	}
	 /**
      * Obtem o conteudo do atributo sexo
      * @return sexo
      */
	public String getSexo() {
            return sexo;
	}
	 /**
      * Altera o atributo sexo
      * @param sexo
      * @throws IllegalArgumentException - se o valor passado por parametro não for masculino ou feminino
      * 
      */
	public void setSexo(String sexo) {
            if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("fem") || 
               sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("masc")){
               this.sexo=sexo;
            }
            else throw new IllegalArgumentException("O sexo deve ser: \n-Masculino\n-Feminino");
	}
	/**
     *  Obtem o conteudo do atributo dataNascimento.
     * @return a data de nascimento da pessoa
     */
	public String getDataNascimento() {
		return sdf.format(dataNascimento.getTime());
	}
	 /**
      * Altera a data de nascimento da pessoa.
      * @param dataNascimento no formato dd/mm/aaaa
      * @throws NullPointerException se o Objeto dataNascimento passado por parametro for nulo
      */
	public void setDataNascimento(String data) {
            if(data!=null){
                try {
                    
                    dataNascimento = Calendar.getInstance();
                    dataNascimento.setTime(sdf.parse(data));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
	 /**
      * Obtem o conteudo do atributo rg
      * @return RG da pessoa
      */
	public String getCpf() {
            return cpf;
	}
	 /**
      * Altera o Valor do RG da pessoa
      * @param rg
      * @throws NullPointerException se o String rg passado por parametro for nulo.
      */
	public void setCpf(String cpf) {
            if(cpf!=null && ValidaCPF.isValido(cpf)){
                this.cpf=cpf;
            }
	}

    @Override
    /**
      * Obtem a String do objeto.
      * @return Uma String com os dados do objeto.
      */
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + getDataNascimento()+"}";
    }
    
    @Override
    /**
     * Aletera o hashCode do objeto
     * @return hashCode do objeto
     */
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        hash = 59 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    /**
     * Compara o nome e rg deste objeto com o do passado por parametro.
     * @param objeto
     * @return true- se forem iguais
     *         false- se forem diferentes.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return (this.cpf == null) ? (other.cpf == null) : this.cpf.equals(other.cpf);
    }
    
    //Método para testar o código
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("520.230.130-89", "Karen", "02/04/1973", "feminino");
        System.out.println(p1);
        
        Pessoa p2 = new Pessoa ("520230130-89", "Karen", "2/4/1973", "fem");
        System.out.println(p2);
        
    }
       
}
    


	
    
    
    
    
 
