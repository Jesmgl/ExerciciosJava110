package exerciciosjava;

import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {
			
		
		 Scanner teclado = new Scanner(System.in);

	        int[] numeros = new int[5];
	        int Pares = 0;

	        System.out.println("Digite 5 n�meros inteiros:");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("N�mero " + (i + 1) + ": ");
	            numeros[i] = teclado.nextInt();

	            if (numeros[i] % 2 == 0) {
	                Pares++;
	            }
	        }
	        
	        System.out.println("Quantidade de n�meros pares: " + Pares);

	        teclado.close();
	
	
	
	
	}

}
