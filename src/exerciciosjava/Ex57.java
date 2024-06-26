package exerciciosjava;
import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        int divisor = 2;
	        boolean isPrimo = true;

	        if (numero <= 1) {
	            isPrimo = false;
	        } else {
	            do {
	                if (numero % divisor == 0) {
	                    isPrimo = false;
	                    break;
	                }
	                divisor++;
	            } while (divisor <= numero / 2);
	        }

	        if (isPrimo && numero > 1) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }

	        scanner.close();

	}

}
