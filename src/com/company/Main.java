package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// Instanciar duas contas (uma de cada tipo), credita algum valor para elas e efetua um saque
        //(obs: no objeto conta poupan�a, fa�a um saque maior que o saldo atual).
        //Crie um objeto relat�rio e execute o m�todo gerar relat�rio para cada conta criada.

        Banco bancoDados = new Banco();
        Relatorio r = new Relatorio();

        ContaCorrente cc1 = new ContaCorrente(123);
        ContaCorrente cc2 = new ContaCorrente(4321);
        ContaPoupanca cp1 = new ContaPoupanca(321);

        cc1.mostrarDados();
        cc2.mostrarDados();
        cp1.mostrarDados();

        cc1.transferir(cp1,100);
        cc1.transferir(cc2,100);
        cc1.mostrarDados();
        cc2.mostrarDados();
        cp1.mostrarDados();
        
    }
}