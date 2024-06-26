package exerciciosjava;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

        scanner.close();

	}

}
