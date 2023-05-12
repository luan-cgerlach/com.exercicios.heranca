package com.mycompany.mavenproject1;

public class Administrativo extends Funcionario{
    private String setor;

    public Administrativo(String setor, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }
    
    @Override
    public double calcularBonusSalario() {
        return super.getSalario() * 0.05;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(toString());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
         return "Administrativo{" + "setor= " + setor + "bonus salarial= " +calcularBonusSalario()+ '}' + super.toString();    }
    
}
