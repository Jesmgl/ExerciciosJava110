package exerciciosjava;

import java.util.Scanner;

public class Ex82 {

	public static void main(String[] args) {
		
	
	
	      Scanner teclado = new Scanner(System.in);

	        
	        int[] numeros = new int[10];

	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = teclado.nextInt();
	        }
	        
	        int soma = 0;
	        
	        for (int i = 0; i < numeros.length; i++) {
	            soma += numeros[i];
	        }

	        System.out.println("A soma dos números é: " + soma);

	        teclado.close();
	
	
	
	
	
	
	}

}
