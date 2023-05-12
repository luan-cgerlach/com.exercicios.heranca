package com.mycompany.exercicio02;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano; 

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract double velocidadeMaxima();
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + '}'+"velocidadeMaxima= " +velocidadeMaxima();
    }
    
    
}
