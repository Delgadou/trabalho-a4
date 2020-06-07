package com.company;

import java.util.ArrayList;

public class Banco {

    //Possui uma arraylist de contas bancarias e implemente os metodos inserir, remover e procurarConta
    // o primeiro e o segundo recebem um obejto conta (que pode ser corrente ou poupanca) e o insere e remove no arraylist
    // o terceiro recebe um inteiro como parametro representando o numero da conta e retorna um obejto conta bancaria, caso essa conta exista no arraylist ou null caso contrario.


    ArrayList<ContaBancaria> bancoContas = new ArrayList<>();
    int quantidadeContas = bancoContas.size();

    public void inserirConta(ContaBancaria conta)
    {
        bancoContas.add(conta);
        System.out.println("Conta de numero " + conta.getNumeroConta() + " adicionada.");
    }

    public void removerConta(ContaBancaria conta)
    {
        bancoContas.remove(conta);
        System.out.println("Conta de numero " + conta.getNumeroConta() + " removida.");
    }

    public void procurarConta(int numeroConta) {
        for (int i = 0; i < bancoContas.size(); i++) {
            if (bancoContas.get(i).getNumeroConta() == numeroConta) {
                System.out.print("Numero da conta: " + bancoContas.get(i).getNumeroConta());
                System.out.print(" saldo: " + bancoContas.get(i).getSaldo() + " ");
                bancoContas.get(i).tipoConta();
            } else {
                System.out.println("Null");
            }
        }
    }
}
