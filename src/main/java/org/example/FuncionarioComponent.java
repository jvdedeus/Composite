package org.example;

import java.util.List;

public abstract class FuncionarioComponent {
    protected String nome;
    protected double salario;

    public FuncionarioComponent(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionar(FuncionarioComponent funcionario) {
        throw new UnsupportedOperationException();
    }

    public void remover(FuncionarioComponent funcionario) {
        throw new UnsupportedOperationException();
    }

    public List<FuncionarioComponent> getSubordinados() {
        throw new UnsupportedOperationException();
    }

    public abstract void exibirInformacoes();
}

