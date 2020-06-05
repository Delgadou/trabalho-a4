package com.company;

public class ContaPoupanca extends ContaBancaria implements mostrarDados {
    protected double limite;

    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

}
