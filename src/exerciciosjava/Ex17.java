package exerciciosjava;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("A pessoa é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa é um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa é um adulto.");
        } else {
            System.out.println("A pessoa é um idoso.");
        }

        scanner.close();

	}

}
