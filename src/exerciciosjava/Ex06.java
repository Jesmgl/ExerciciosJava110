package exerciciosjava;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		
		for (int n=1; n<=10; n++) {
		
			
			System.out.println("Digite um numero");
			int numero = teclado.nextInt();
			
			if(numero % 2  == 0) {
				System.out.println(numero + "É um numero PAR!");
				
				par = par+1;
			} else {
				System.out.println(numero + "É um numero IMPAR!");
				
				impar = impar+1;
			}
		}
		
		System.out.println("Números pares: " + par);
		System.out.println("Números impares: " + impar);

	}

}
