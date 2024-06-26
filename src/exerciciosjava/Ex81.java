package exerciciosjava;

import java.util.Scanner;

public class Ex81 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Números na ordem inversa:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        teclado.close(); 
	}

}
