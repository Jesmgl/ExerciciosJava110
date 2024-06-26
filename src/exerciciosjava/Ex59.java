package exerciciosjava;
import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double mediaIdades = somaIdades / 5.0;
        System.out.printf("A média das idades das 5 pessoas é: %.2f%n", mediaIdades);

        scanner.close();

	}

}
