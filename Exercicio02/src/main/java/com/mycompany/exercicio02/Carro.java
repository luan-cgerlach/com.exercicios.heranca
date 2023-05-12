package com.mycompany.exercicio02;

public class Carro extends Veiculo{
    private int numPortas;
    
    public Carro(int numPortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }
    
    @Override
    public double velocidadeMaxima() {
        return 200.0;
    }

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
        return "Carro{" + "numPortas=" + numPortas + '}' +super.exibirDetalhes();
    }
    
    
    
}
