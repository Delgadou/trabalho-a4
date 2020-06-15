package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
	
	Banco bancoDados = new Banco();
    Relatorio r = new Relatorio();
    String menuOption;
	ArrayList<ContaBancaria> lista = bancoDados.getBancoContas();
    
    do {
    System.out.println("-----------------");
	System.out.println("Menu");
	System.out.println("1 - Criar conta");
	System.out.println("2 - Selecionar conta");
	System.out.println("3 - Remover conta");
	System.out.println("4 - Gerar relatório");
	System.out.println("5 - Finalizar");
	System.out.print("Selecione uma das opções acima: ");
	Scanner scan = new Scanner(System.in);
	menuOption = scan.next();
	System.out.println("-----------------");
	
	// Criar Conta
	if (menuOption.equals("1")) {
		System.out.println("-----------------");
		System.out.println("Menu - Criação de Conta");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança");
		System.out.print("Selecione uma das opções acima: ");
    	String accOption = scan.next();
    	System.out.println("-----------------");
    	
    	// Conta Corrente
    	if (accOption.equals("1")) {
    		System.out.print("Informe o número da Conta Corrente: ");
    		int accNumber = scan.nextInt();
    		
    		ContaCorrente cc = new ContaCorrente(accNumber);
    		bancoDados.inserirConta(cc);
    		
    	// Conta Poupança	
    	} else if (accOption.equals("2")) {
    		System.out.print("Informe o número da Conta Poupança: ");
    		int accNumber = scan.nextInt();
    		
    		ContaPoupanca cp = new ContaPoupanca(accNumber);
    		bancoDados.inserirConta(cp);
    	} else if (accOption.equals("5")) {
    		menuOption = "";
    	}
    	
    // Selecionar Conta
	} else if (menuOption.equals("2")) {
		System.out.print("Informe sua Conta: ");
		int accSelecionada = scan.nextInt();
		
		
		System.out.println("XXXXXX");
    	bancoDados.procurar(accSelecionada);
    	System.out.println("XXXXXX");
    	
    	System.out.println("1 - Depositar");
    	System.out.println("2 - Sacar");
    	System.out.println("3 - Transferir");
    	System.out.println("4 - Gerar relatório");
    	System.out.println("5 - Finalizar");
    	System.out.print("Selecione uma das opções acima: ");
    	String opOption = scan.next();
    	
    	// Depositar
    	if (opOption.equals("1")) {
    		System.out.print("Selecione um valor para depositar: ");
        	Double valor = scan.nextDouble();
        	lista.stream().filter(it -> it.numeroConta == accSelecionada).forEach(it -> it.depositar(valor));
        
        // Sacar	
    	} else if (opOption.equals("2")) {
    		System.out.print("Selecione um valor para sacar: ");
        	Double valor = scan.nextDouble();
        	lista.stream().filter(it -> it.numeroConta == accSelecionada).forEach(it -> it.sacar(valor));
        	
        // Transferir	
        } else if (opOption.equals("3")) {
    		System.out.print("Selecione um valor para transferir: ");
        	Double valor = scan.nextDouble();
        	System.out.print("Selecione uma conta para transferir: ");
        	int conta = scan.nextInt();
        	
        	
        // Relatório da Conta
        } else if (opOption.equals("4")) {
    		bancoDados.procurarConta(accSelecionada);
        }
    	
	
    // Remover Conta	
	} else if (menuOption.equals("3")) {
		System.out.print("Informe sua Conta: ");
		int accDelet = scan.nextInt();
		bancoDados.removerConta(bancoDados.procurar(accDelet));
		
	} else if (menuOption.equals("4")) {
		
		
		System.out.println("Todas as Contas registradas");
		System.out.println(bancoDados.toString());
            
		
	} else if (menuOption.equals("5")) {
		System.out.println("Encerrando...");
		System.exit(0);
	}
    
    } while(! menuOption.equals("5"));
	
	
	
	
	
	
	}
}	 