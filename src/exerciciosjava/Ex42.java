package exerciciosjava;
import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        int divisor = 2;
	        boolean isPrimo = true;

	        while (divisor <= numero / 2) {
	            if (numero % divisor == 0) {
	                isPrimo = false;
	                break;
	            }
	            divisor++;
	        }

	        if (isPrimo && numero > 1) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }

	        scanner.close();

	}

}
