package com.company;

import org.junit.Test;

public class Testebanco {

    @Test
    public void testeBancooperacoes()
    {
        Banco banco = new Banco();
        ContaCorrente cc1 = new ContaCorrente(1232131,500);
        ContaPoupanca cc2 = new ContaPoupanca(123123,0);
        ContaPoupanca cc3 = new ContaPoupanca(12233123,78);

        //Adicionando as 2 contas ao banco de contas
        banco.inserirConta(cc1);
        banco.inserirConta(cc2);
        banco.inserirConta(cc3);

        System.out.println("\n");

        //Removendo uma conta
        banco.removerConta(cc1);

        //Procurando uma conta.
        banco.procurarConta(12233123);


    }

}
