package com.company;

import java.util.ArrayList;
//import java.util.List;

public class Banco {

    // Possui uma arraylist de contas bancarias e implemente os metodos inserir, remover e procurarConta
    // o primeiro e o segundo recebem um obejto conta (que pode ser corrente ou poupanca) e o insere e remove no arraylist
    // o terceiro recebe um inteiro como parametro representando o numero da conta e retorna um obejto conta bancaria, caso essa conta exista no arraylist ou null caso contrario.


    ArrayList<ContaBancaria> bancoContas = new ArrayList<>();

    public ArrayList<ContaBancaria> getBancoContas() {
		return bancoContas;
	}

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
                System.out.println("Conta Inexistente!");
            }
        }
    }
    
    public ContaBancaria procurar(int numeroConta) {
        for (int i = 0; i < bancoContas.size(); i++) {
            if (bancoContas.get(i).getNumeroConta() == numeroConta) {
                return bancoContas.get(i);
            } else {
                System.out.println("");
            }
        }
		return null;
    }

	@Override
	public String toString() {
		for(int i = 0; i < bancoContas.size(); i++){
			System.out.println("Conta: " + bancoContas.get(i).getNumeroConta() + " saldo: " + bancoContas.get(i).getSaldo());
		}
		
		return null;
	}
    
    
    
}
