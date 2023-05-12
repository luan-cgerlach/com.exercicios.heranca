package com.mycompany.mavenproject1;

public class Main {

    public static void main(String[] args) {

        Funcionario cuca = new Professor("Truco", "Cuca", 18, 10000.0);
        Funcionario luan = new Administrativo("Administrativo", "Luan", 18, 20000.0);

        System.out.println(luan.toString());
        System.out.println(cuca.toString());
    }
}
