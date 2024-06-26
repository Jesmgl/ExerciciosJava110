package exerciciosjava;

import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);

        System.out.println("Os dígitos do número " + numero + " são:");

        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i); 
            System.out.println(digito);
        }

        scanner.close();
		

	}

}
