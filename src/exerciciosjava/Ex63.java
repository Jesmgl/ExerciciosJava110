package exerciciosjava;
import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroOriginal = numero;

        // Variável para armazenar o último dígito
        int digito;

        // Loop do-while para extrair e exibir os dígitos
        do {
            digito = numero % 10; // Obtém o último dígito do número
            System.out.println(digito); // Exibe o dígito

            // Remove o último dígito do número
            numero = numero / 10;
        } while (numero != 0);

        // Se o número original for zero, exibe o dígito zero
        if (numeroOriginal == 0) {
            System.out.println(0);
        }

        scanner.close();

	}

}
