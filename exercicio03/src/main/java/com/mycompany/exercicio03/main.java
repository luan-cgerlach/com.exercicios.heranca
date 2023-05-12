package com.mycompany.exercicio03;

public class main {

    public static void main(String[] args) {
        Produto cd = new CD("cuca", "Us GU", 20);
        Produto livro = new Livro("quero café", 50);
        
        System.out.println(cd.exibirDetalhes());
        System.out.println(livro.exibirDetalhes());
    }
}
