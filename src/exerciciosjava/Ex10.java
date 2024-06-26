package exerciciosjava;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		 Scanner valor = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = valor.nextInt();
	        
	        System.out.println("Tabuada de multiplicação de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	        
	        valor.close();

	}

}
