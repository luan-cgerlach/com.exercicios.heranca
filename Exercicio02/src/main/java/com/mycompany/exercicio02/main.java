package com.mycompany.exercicio02;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        Veiculo cg160 = new Moto(false, "honda", "titan", 2005);
        Veiculo cg150 = new Moto(true, "honda", "fan", 2015);
        Veiculo hornet = new Moto(true, "honda", "hornet", 2012);
        Veiculo jetta = new Carro(4, "Wolkswagen", "jetta", 2015);
        Veiculo creta = new Carro(4, "Wolkswagen", "creta", 2020);
        Veiculo gol = new Carro(2, "Wolkswagen", "gol", 2001);
        Veiculo saveiro = new Carro(2, "Wolkswagen", "saveiro", 2021);
        Veiculo strada = new Carro(2, "fiat", "strada", 2015);
        Veiculo s10 = new Carro(4, "chevrolet", "s10", 2023);
        Veiculo corolla = new Carro(4, "toyota", "corolla", 208);
        
        List<Veiculo> veiculos = Arrays.asList(cg160,cg150, hornet, jetta, creta, gol, saveiro, strada, s10, corolla);
        
        veiculos.stream().forEach(v ->{
            System.out.println(v.exibirDetalhes());
        });
        
    }
}
