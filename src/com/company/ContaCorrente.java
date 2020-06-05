package com.company;

public class ContaCorrente extends ContaBancaria implements mostrarDados {
    protected double taxaOperacao;

    public ContaCorrente(int numeroConta, double saldo) {
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

    public double saldo()
    {
        return saldo;
    }

}
