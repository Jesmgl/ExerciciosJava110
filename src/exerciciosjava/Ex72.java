package exerciciosjava;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);

	        
	        System.out.print("Digite um n�mero inteiro positivo maior que 1: ");
	        int numero = teclado.nextInt();

	       
	        if (numero <= 1) {
	            System.out.println("Por favor, insira um n�mero inteiro positivo maior que 1.");
	        } else {
	            boolean Primo = true;

	            
	            for (int i = 2; i < numero; i++) {
	                if (numero % i == 0) { 
	                    Primo = false;
	                    break; 
	                }
	            }

	           
	            if (Primo) {
	                System.out.println(numero + " � um n�mero primo.");
	            } else {
	                System.out.println(numero + " n�o � um n�mero primo.");
	            }
	        }

	        teclado.close();
	
	
	
	
	}

}
