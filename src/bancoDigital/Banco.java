package bancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
	   
		ContaCliente contacliente; 
		
		Cliente cliente;
		
		Cliente[] listaClientes = new Cliente[30];
		ContaCliente[] listaContas = new ContaCliente[60];
		
		String fim = "N"; 

		while (fim == "N"); {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite uma das opções abaixo:");
			System.out.println("(S)acar $$$");
			System.out.println("(D)epositar $$$"); 
			System.out.println("(T)ransferir entre C/C"); 
			System.out.println("(C)riar nova Conta"); 
			System.out.println("(X) SAIR");
			System.out.println("_____________Opção:");
			String opcaoUsuario = entrada.next();
			entrada.close();
			switch (opcaoUsuario) {
	     		case "X":
	     		    fim = "S";
			    case "C": 
			    	System.out.print("Me informe o cpf:");
			    	Integer cpfDigitado = Integer.parseInt(entrada.nextLine());
			    	String nomePesquisado = pesquisaCliente(cpfDigitado, listaClientes); 
			    	if nomePesquisado = null {
			    	   System.out.print("Me informe o Nome do Cliente:");
			    	   String nomePesquisado = entrada.next();
			    	}
			    		
					cliente.cadastraCliente(cpfDigitado, ); 

					
			    case "T": 
			    	System.out.println("Opcao T em construcao"); 
			    case "D": 
			    	System.out.println("Opcao D em construcao"); 
			    case "S": 
			    	System.out.println("Opcao S em construcao"); 
			}
		}
		
		System.out.print(">>>> Volte Sempre <<<<");
		
	}
	
	public static void pesquisaCliente(Integer cpfCliente, List listaClientes) {
		for (int i = 0; i <= listaClientes.lastIndexOf())
		for (Object object : listaClientes) {
		  if cpfCliente = listaClientes.
		}
		return 
	}

}
