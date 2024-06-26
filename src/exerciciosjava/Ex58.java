package exerciciosjava;
import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        int a = 0, b = 1;
	        System.out.print("Sequência de Fibonacci até " + numero + ": " + a);

	        do {
	            System.out.print(", " + b);
	            int temp = a;
	            a = b;
	            b = temp + b;
	        } while (b <= numero);
	        
	        System.out.println();
	        scanner.close();

	}

}
