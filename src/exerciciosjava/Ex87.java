package exerciciosjava;
import java.util.Scanner;



public class Ex87 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        int[] numeros = new int[10];

		        for (int i = 0; i < 10; i++) {
		            System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
		            numeros[i] = scanner.nextInt();
		        }

		        int quantidadePositivos = contarPositivos(numeros);

		        System.out.printf("\nQuantidade de n�meros positivos: %d%n", quantidadePositivos);

		        scanner.close();
		    }

		    public static int contarPositivos(int[] numeros) {
		        int contador = 0;

		        for (int numero : numeros) {
		            if (numero > 0) {
		                contador++;
		            }
		        }

		        return contador;
		    }
	}


