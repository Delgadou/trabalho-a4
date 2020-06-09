package com.company;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
    protected double taxaOperacao = 0.3;

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

    @Override
    protected double getTaxaDeOperacao() {
        return taxaOperacao;
    }

    public double saldo()
    {
        return saldo;
    }

    public double getTaxaOperacao()
    {
        return taxaOperacao;
    }

    /*
    @Override
    public void transferir(double valor, ContaBancaria conta) {
        double valorTaxa = valor*taxaOperacao;
        this.saldo = saldo - valor - valorTaxa;
        conta.saldo = conta.saldo + valor;
    }
*/
    @Override
    public void mostrarDados() {
        System.out.println("Numero da conta: " + super.getNumeroConta() + " Saldo: " + super.getSaldo() + " Taxa Operação: " + getTaxaOperacao());
    }

    @Override
    public void tipoConta() {
        System.out.println("Conta Corrente");
    }
}
