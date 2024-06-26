package exerciciosjava;
import java.util.Scanner;



public class Ex88 {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        double mediaPares = calcularMediaPares(numeros);
        double mediaImpares = calcularMediaImpares(numeros);

        System.out.printf("M�dia dos valores pares: %.2f%n", mediaPares);
        System.out.printf("M�dia dos valores �mpares: %.2f%n", mediaImpares);

        scanner.close();
    }

    public static double calcularMediaPares(int[] numeros) {
        int somaPares = 0;
        int quantidadePares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) { 
                somaPares += numero;
                quantidadePares++;
            }
        }

        if (quantidadePares > 0) {
            return (double) somaPares / quantidadePares;
        } else {
            return 0; 
        }
    }

    public static double calcularMediaImpares(int[] numeros) {
        int somaImpares = 0;
        int quantidadeImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 != 0) { 
                somaImpares += numero;
                quantidadeImpares++;
            }
        }

        if (quantidadeImpares > 0) {
            return (double) somaImpares / quantidadeImpares;
        } else {
            return 0; 
        }
    }
}

