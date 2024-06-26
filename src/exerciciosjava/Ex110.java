package exerciciosjava;
import java.util.Scanner;



public class Ex110 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSubtracao = new int[2][2];

        System.out.println("Digite os valores da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);

        System.out.println("\nDigite os valores da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                matrizSubtracao[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("\nMatriz Resultado da Subtra��o:");
        exibirMatriz(matrizSubtracao);

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }


    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}


