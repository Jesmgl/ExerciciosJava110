package exerciciosjava;

import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		

		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Digite um número inteiro positivo para a sequência de Fibonacci: ");
	        int numero = scanner.nextInt();

	       
	        if (numero <= 0) {
	            System.out.println("Por favor, insira um número inteiro positivo.");
	        } else {
	            System.out.println("Sequência de Fibonacci até " + numero + ":");

	       
	            int a = 0;
	            int b = 1;

	           
	            System.out.print(a + ", " + b);

	            for (int i = 2; i <= numero; i++) {
	                int proximo = a + b;
	                System.out.print(", " + proximo);
	                a = b;
	                b = proximo;
	            }
	            System.out.println(); 
	        }
	        
	        scanner.close();

	}

}
