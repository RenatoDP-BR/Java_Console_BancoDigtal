package bancoDigital;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
	   
		int fim = 0; 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um texto:"); 
		while (fim == 0) {
			fim++; 
			System.out.println("Token: "+entrada.next());
			System.out.println("fim  : "+fim);
		}
		entrada.close();
	}

}
