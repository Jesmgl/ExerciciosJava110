package exerciciosjava;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int contadorMenoresIdade = 0;
        int contadorMaioresIdade = 0;

        System.out.print("Digite o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                contadorMenoresIdade++;
            } else {
                contadorMaioresIdade++;
            }
        }

        System.out.println("Número de pessoas menores de idade: " + contadorMenoresIdade);
        System.out.println("Número de pessoas maiores de idade: " + contadorMaioresIdade);

        scanner.close();

	}

}
