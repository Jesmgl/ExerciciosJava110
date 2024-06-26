package exerciciosjava;
import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int divisor = 1;
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
        scanner.close();

	}

}
