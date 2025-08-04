package org.example;

public class Funcionario extends FuncionarioComponent {
    public Funcionario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome + ", Salário: R$ " + salario);
    }
}

