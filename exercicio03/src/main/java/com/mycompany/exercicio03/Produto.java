package com.mycompany.exercicio03;

public abstract class Produto {
    public String titulo;
    public double preco;

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public abstract double calcularDesconto();
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String exibirDetalhes() {
        return "Produto{" + "titulo=" + titulo + ", preco=" + preco + '}' + "desconto de " +calcularDesconto();
    }
    
    
}
