package com.company;

abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;

    //Incremente a clase conta bancaria com o metodo transferir que recebe o parametro o valor(double) e um objeto conta bancaria e transfere o valor desejado da conta atual
    // para cada conta informada. use metodos sacar e depositar para isso.


    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor)
    {
    }

    public void depositar(double valor)
    {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
