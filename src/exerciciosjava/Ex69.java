package exerciciosjava;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {
		
	
		  Scanner teclado = new Scanner (System.in);
		  
	        int soma = 0;
	        int quantidadeNumeros = 5;

	        System.out.println("Por favor, insira " + quantidadeNumeros + " números inteiros:");

	       
	        for (int i = 1; i <= quantidadeNumeros; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            int numero = teclado.nextInt();
	            soma += numero;  
	        }

	        double media = (double) soma / quantidadeNumeros;

	        System.out.println("A média aritmética dos números inseridos é: " + media);

	        teclado.close();
	
	
	
	
	}
	
	

}
