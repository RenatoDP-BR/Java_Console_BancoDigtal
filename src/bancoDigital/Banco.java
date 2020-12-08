package bancoDigital;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
	   
		String fim = "N"; 

		while (fim == "N"); {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite uma das opções abaixo:");
			System.out.println("(S)acar $$$");
			System.out.println("(D)epositar $$$"); 
			System.out.println("(T)ransferir entre C/C"); 
			System.out.println("(C)riar nova Conta"); 
			System.out.println("(X) SAIR");
			System.out.print("_____________Opção:");
			String opcaoUsuario = entrada.next();
			entrada.close();
			switch (opcaoUsuario) {
	     		case "X":
	     		   fim = "S";
		    	   break;
			    case "C": 
			    	System.out.println("Opcao C em construcao"); 
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

}
