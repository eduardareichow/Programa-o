/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 08050443
 */
public class DadosSaude {
    
    //atributos
    private double peso;
    private int altura;
    private int medidaCintura;
    private int pressaoArterialMin;
    private int pressaoArterialMax;
    
    //construtores
    public DadosSaude(){
        
    }

    public DadosSaude(double peso, int altura, int medidaCintura, int pressaoArterialMin, int pressaoArterialMax) {
        setPeso(peso);  
        setAltura(altura);
        setMedidaCintura(medidaCintura);
        setPressaoArterialMin(pressaoArterialMin);
        setPressaoArterialMax(pressaoArterialMax);
    }
    
    //getters e setters

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public void setPressaoArterialMin(int pressaoArterialMin) {
        this.pressaoArterialMin = pressaoArterialMin;
    }

    public void setPressaoArterialMax(int pressaoArterialMax) {
        this.pressaoArterialMax = pressaoArterialMax;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public int getPressaoArterialMin() {
        return pressaoArterialMin;
    }

    public int getPressaoArterialMax() {
        return pressaoArterialMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 17 * hash + this.altura;
        hash = 17 * hash + this.medidaCintura;
        hash = 17 * hash + this.pressaoArterialMin;
        hash = 17 * hash + this.pressaoArterialMax;
        return hash;
    }

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
        final DadosSaude other = (DadosSaude) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        if (this.medidaCintura != other.medidaCintura) {
            return false;
        }
        if (this.pressaoArterialMin != other.pressaoArterialMin) {
            return false;
        }
        if (this.pressaoArterialMax != other.pressaoArterialMax) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString(){
        return  "Dados Saude\n" + 
                "Peso: " + getPeso() +  
                "\nAltura: " + getAltura() +
                "\nMedida da cintura: " + getMedidaCintura() +
                "\nPressao Arterial: " + getPressaoArterialMax() + "/"+  getPressaoArterialMin();
       
    }
    

    
}
