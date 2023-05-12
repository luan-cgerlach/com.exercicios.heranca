package com.mycompany.mavenproject1;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String disciplina, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.disciplina = disciplina;
    }
    
    @Override
    public double calcularBonusSalario() {
     return super.getSalario() * 0.1;   
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(toString());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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
        return "Professor{" + "disciplina= " + disciplina + "bonus salarial= " +calcularBonusSalario()+ '}' + super.toString();
    }
    
    
}
