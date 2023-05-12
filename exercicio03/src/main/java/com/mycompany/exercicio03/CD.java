package com.mycompany.exercicio03;

public class CD extends Produto{
    private String artista;

    public CD(String artista, String titulo, double preco) {
        super(titulo, preco);
        this.artista = artista;
    }

    @Override
    public double calcularDesconto() {
            return this.preco * 0.95;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
        return "CD{" + "artista=" + artista + '}' + super.exibirDetalhes();
    }
    
    
    
}
