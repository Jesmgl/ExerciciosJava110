package exerciciosjava;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);

		  int n;

	        System.out.print("Insira um número inteiro para calcular o fatorial: ");
	        n = teclado.nextInt();

	        while (n < 0) {
	            System.out.print("Insira um número inteiro não-negativo: ");
	            n = teclado.nextInt();
	        }

	        long fatorial = 1;
	        int i = n;

	        do {
	            fatorial *= i;
	            i--;
	        } while (i > 0);

	        System.out.println("O fatorial de " + n + " é " + fatorial);

	        teclado.close();
	    }
}

	


