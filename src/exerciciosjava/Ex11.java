package exerciciosjava;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A média aritmética é: %.2f%n", media);

        scanner.close();

	}

}
