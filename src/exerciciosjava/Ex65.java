package exerciciosjava;

import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		// 65) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.

		Scanner teclado = new Scanner (System.in);
		
		 String nome;
	        int idade;
	        int somaIdades = 0;
	        int contador = 0;

	         do {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            nome = teclado.nextLine();

	            if (!nome.equalsIgnoreCase("fim")) {
	                System.out.print("Digite a idade: ");
	                idade = teclado.nextInt();
	               teclado.nextLine();
	               
	                somaIdades += idade;
	                contador++;
	            }

	        } while (!nome.equalsIgnoreCase("fim"));

	      
	        if (contador > 0) {
	            double media = (double) somaIdades / contador;
	            System.out.println("A média das idades é: " + media);
	        } else {
	            System.out.println("Nenhuma idade foi inserida.");
	        }

	       teclado.close();
	    
	}

}
