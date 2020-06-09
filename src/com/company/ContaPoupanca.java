package com.company;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    protected double limite;

    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(limite > saldo-valor)
        {
            System.out.println("Limite ultrapassado");
        }
        else
        {
            this.saldo = saldo-valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

/*
    @Override
    public void transferir(double valor, ContaBancaria conta) {
        this.saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }

*/

    @Override
    protected double getTaxaDeOperacao() {
        return 0;
    }

    public double saldo()
    {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Numero da conta: " + super.getNumeroConta() + " Saldo: " + super.getSaldo() + " Taxa Operação: " + getLimite());
    }

    @Override
    public void tipoConta() {
        System.out.println("Conta Poupança");
    }

}
