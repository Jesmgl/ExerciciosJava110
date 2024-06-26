package exerciciosjava;

import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		

		
		Scanner teclado = new Scanner(System.in);
		
		 System.out.print("Digite um número inteiro para ver sua tabuada: ");
	        int numero = teclado.nextInt();

	        
	        System.out.println("Tabuada de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	       teclado.close();
		
		
	}

}
