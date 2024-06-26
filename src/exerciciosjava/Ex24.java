package exerciciosjava;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");
        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Número 3: ");
        int numero3 = scanner.nextInt();

        int menor, meio, maior;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                meio = numero2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                meio = numero1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                meio = numero1;
                maior = numero2;
            } else {
                meio = numero2;
                maior = numero1;
            }
        }

        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
	}

}
