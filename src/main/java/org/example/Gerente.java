package org.example;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends FuncionarioComponent {
    private List<FuncionarioComponent> subordinados = new ArrayList<>();

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void adicionar(FuncionarioComponent funcionario) {
        subordinados.add(funcionario);
    }

    @Override
    public void remover(FuncionarioComponent funcionario) {
        subordinados.remove(funcionario);
    }

    @Override
    public List<FuncionarioComponent> getSubordinados() {
        return subordinados;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + nome + ", Salário: R$ " + salario);
        for (FuncionarioComponent f : subordinados) {
            f.exibirInformacoes();
        }
    }
}

