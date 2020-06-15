package com.company;
import org.junit.Test;

public class TesteContaBancaria {

    @Test
    public void testesContas()
    {
        Banco bancoContas = new Banco();
        Relatorio r = new Relatorio();

        //Criando 2 contas. 1 corrente e outra poupanca
        ContaCorrente cc1 = new ContaCorrente(1232131);
        ContaPoupanca cc2 = new ContaPoupanca(123123);

        //Verificando saldo de cada conta
        System.out.println("Saldo corrente: " + cc1.getSaldo());
        System.out.println("Saldo Poupanca: " + cc2.getSaldo() + " \n");

        System.out.println("SALDO APOS PRIMEIRA TRANSFERENCIA \n");

        cc1.transferir(cc2,100);
        System.out.println("Saldo corrente: " + cc1.getSaldo());
        System.out.println("Saldo Poupanca: " + cc2.getSaldo() + " \n");


        System.out.println("SALDO APOS SEGUNDA TRANSFERENCIA \n");
        cc2.transferir(cc1,50);
        System.out.println("Saldo corrente: " + cc1.getSaldo());
        System.out.println("Saldo Poupanca: " + cc2.getSaldo());
    }


}
