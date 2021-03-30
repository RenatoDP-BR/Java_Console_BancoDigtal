package bancoDigital;


import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
	   
		ContaCliente contacliente;
		
		Cliente cliente; 
		
		String fim = "N"; 

		while (fim == "N"); {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite uma das opções abaixo:");
			System.out.println("(S)acar $$$");
			System.out.println("(D)epositar $$$"); 
			System.out.println("(T)ransferir entre C/C"); 
			System.out.println("(C)riar nova Conta/Cliente");
			
			System.out.println("(X) SAIR");
			System.out.println("_____________Opção:");
			String opcaoUsuario = entrada.next();
			entrada.close();
			switch (opcaoUsuario) {
	     		case "X":
	     		    fim = "S";
	     		    
			    case "C": 
					
			    	System.out.print("Me informe o cpf do cliente:");
			    	Integer cpfDigitado = Integer.parseInt(entrada.nextLine());
			    	
			    	ContaCliente novaConta = new ContaCliente(cpfDigitado);
			    	
			    	if (novaConta.consultaSaldoConta(novaConta.getNumContaCliente()) == 0.0) {

			    		System.out.print("Me informe o nome do cliente:");
				    	String nomeDigitado = entrada.nextLine();
				    	
				    	Cliente novoCliente = new Cliente(cpfDigitado, nomeDigitado);  
				    	
				    	Cliente.ListaDeClientes.add(novoCliente);
				    	
			    		System.out.print("Me informe o saldo do cliente:");
				    	Double saldoDigitado = Double.parseDouble(entrada.nextLine());
				    	novaConta.setSaldoContaCliente(saldoDigitado);
				    	
				    	ContaCliente.ListaDeContas.add(novaConta);
				    	
			    		System.out.print("<<< Conta Criada com Sucesso >>>");
			    		
			    	}
			    	
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
