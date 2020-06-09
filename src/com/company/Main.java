package com.company;

public class Main {

    public static void main(String[] args) {
        // Instanciar duas contas (uma de cada tipo), credita algum valor para elas e efetua um saque
        //(obs: no objeto conta poupança, faça um saque maior que o saldo atual).
        //Crie um objeto relatório e execute o método gerar relatório para cada conta criada.

        Banco bancoDados = new Banco();
        Relatorio r = new Relatorio();

        ContaCorrente cc1 = new ContaCorrente(123,300);
        ContaCorrente cc2 = new ContaCorrente(4321,0);
        ContaPoupanca cp1 = new ContaPoupanca(321,100);

        cc1.mostrarDados();
        cc2.mostrarDados();
        cp1.mostrarDados();

        cc1.transferir(100,cp1);
        cc1.transferir(100,cc2);
        cc1.mostrarDados();
        cc2.mostrarDados();
        cp1.mostrarDados();


    }
}