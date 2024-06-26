package exerciciosjava;
import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a);

        while (b <= numero) {
            System.out.print(", " + b);
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        System.out.println();
        scanner.close();

	}

}
