package exerciciosjava;
import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        int numeroOriginal = numero;
	        
	        while (numero != 0) {
	            int digito = numero % 10;
	            System.out.println(digito);
	            numero = numero / 10;
	        }
	        
	        if (numeroOriginal == 0) {
	            System.out.println(0);
	        }
	        
	        scanner.close();

	}

}
