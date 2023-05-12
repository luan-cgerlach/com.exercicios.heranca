package com.mycompany.exercicio03;

public class Livro extends Produto {
    private String autor;

    public Livro(String titulo, double preco) {
        super(titulo, preco);
    }
    
    @Override
    public double calcularDesconto() {
        return this.preco * 0.9;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

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
        return "Livro{" + "autor=" + autor + '}' + super.exibirDetalhes();
    }
    
    
    
}
