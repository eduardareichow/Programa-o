/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author 08050443
 */
public class Historico {
    
    //atributos
    
    private Calendar data;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Pessoa pessoa;
    private DadosSaude dados;
    
    //construtores
    
    public Historico(Calendar data, Pessoa pessoa, DadosSaude dados) {
        this.data = data;
        this.pessoa = pessoa;
        this.dados = dados;
        
    }

    public Historico() {
        
    }
    
    //getters

    public String getData() {
        return sdf.format(data.getTime());
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public DadosSaude getDados() {
        return dados;
    }

    //setters
    
    public void setData(Calendar data) {
        this.data = data;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setDados(DadosSaude dados) {
        this.dados = dados;
    }

    //hashCode
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.data);
        hash = 73 * hash + Objects.hashCode(this.pessoa);
        hash = 73 * hash + Objects.hashCode(this.dados);
        return hash;
    }

    //equals
    
    @Override
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
        final Historico other = (Historico) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.dados, other.dados)) {
            return false;
        }
        return true;
    }
    
    //toString

    @Override
    public String toString() {
        return "Historico{" + "data=" + data + ", pessoa=" + pessoa + ", dados=" + dados + '}';
    }
    
    //classe Teste
    
    public static void main (String [] args){
        
        //-------------------------TESTE1-------------------------
        Pessoa p1 = new Pessoa ("520.230.130-89", "Karen", "02/04/1973", "feminino");
        DadosSaude dados = new DadosSaude(74.5, 165, 50, 6, 9);
        Calendar data = Calendar.getInstance(); //Pega a data e hora do sistema
        
        Historico h1 = new Historico(data, p1, dados); 
        System.out.println(h1);
        
        //---------------------- TESTE 2 -----------------
        Pessoa p2 = new Pessoa ("520.230.130-89", "Karen", "02/04/1973", "feminino");
        DadosSaude dados2 = null;
        Calendar data2 = Calendar.getInstance();//Pega a data e hora do sistema
        
        Historico h2 = new Historico(data2, p2, dados2); 
        System.out.println(h2);
        
        // RESOLVA UMA FORMA DE OBRIGAR A INFORMAR DADOSSAUDE
    } 
    
}
