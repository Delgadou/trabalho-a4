package com.company;

import org.junit.Test;

public class TesteRelatorio {

    @Test
    public void testeRelatorio()
    {
        Relatorio relatorio = new Relatorio();
        ContaCorrente cc1 = new ContaCorrente(1232131);

        //Mostra os dados da conta.
        cc1.mostrarDados();



    }

}
