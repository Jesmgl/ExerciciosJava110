package exerciciosjava;
import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = soma / 5.0;
        System.out.printf("A média aritmética dos valores lidos é: %.2f%n", media);

        scanner.close();

	}

}
