package com.company;

public abstract class ContaBancaria{
    protected int numeroConta;
    protected double saldo;

    //Incremente a clase conta bancaria com o metodo transferir que recebe o parametro o valor(double) e um objeto conta bancaria e transfere o valor desejado da conta atual
    // para cada conta informada. use metodos sacar e depositar para isso.


    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.00;
    }

    public void sacar(double valor){}

    public void depositar(double valor){}

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tipoConta(){}

    protected abstract double getTaxaDeOperacao();

    public void transferir(ContaBancaria conta, double valor) {
        if (this instanceof ContaCorrente) {
            ContaCorrente contaccorrente = ((ContaCorrente) this);
            boolean verificador = (this.getSaldo() - valor - contaccorrente.getTaxaDeOperacao()) > 0;
            if (verificador) {
                contaccorrente.sacar(valor);
                conta.depositar(valor);
            }
        } else {
            ContaPoupanca contapoupanca = ((ContaPoupanca) this);
            boolean verificador = (contapoupanca.getSaldo() - valor) >= contapoupanca.getLimite();
            if (verificador) {
                contapoupanca.sacar(valor);
                conta.depositar(valor);
            }
        }
    }
}


