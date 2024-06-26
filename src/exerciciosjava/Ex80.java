package exerciciosjava;

import java.util.Scanner;

public class Ex80 {

	public static void main(String[] args) {
		
	
		 Scanner teclado = new Scanner(System.in);

	        int somaIdades = 0;
	        int contadorPessoas = 0;
	        String nome;

	        System.out.println("Digite o nome (ou 'fim' para encerrar): ");
	        nome = teclado.nextLine();

	        while (!nome.equalsIgnoreCase("fim")) {
	            System.out.print("Digite a idade de " + nome + ": ");
	            int idade = teclado.nextInt();
	            teclado.nextLine(); 

	            somaIdades += idade;
	            contadorPessoas++;

	            System.out.println("Digite o nome (ou 'fim' para encerrar): ");
	            nome = teclado.nextLine();
	        }

	        if (contadorPessoas > 0) {
	            double mediaIdades = (double) somaIdades / contadorPessoas;
	            System.out.println("A média das idades das pessoas é: " + mediaIdades);
	        } else {
	            System.out.println("Nenhuma pessoa foi inserida.");
	        }

	        teclado.close();
	
	
	}

}
