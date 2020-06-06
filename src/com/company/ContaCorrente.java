package com.company;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
    protected double taxaOperacao = 0.03;

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        }
        else
        {
            double valorTaxa = (saldo - valor) * taxaOperacao;
            this.saldo = saldo - valor - valorTaxa;
        }
    }

    @Override
    public void depositar(double valor) {
        double valorTaxa = valor*taxaOperacao;
        this.saldo = (saldo + valor) - valorTaxa;
    }

    public double saldo()
    {
        return saldo;
    }

    public double getTaxaOperacao()
    {
        return taxaOperacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Numero da conta: " + super.getNumeroConta() + "Saldo: " + super.getSaldo() + "Taxa Operação: " + getTaxaOperacao());
    }
}
