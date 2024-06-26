package exerciciosjava;
import java.util.Scanner;

public class Ex102 {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizProduto = new int[2][2]; 

        System.out.println("Digite os valores da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os valores da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) {
                matrizProduto[i][j] = 0; 
                for (int k = 0; k < 2; k++) { 
                    matrizProduto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("\nMatriz 1 informada:");
        exibirMatriz(matriz1);

        System.out.println("\nMatriz 2 informada:");
        exibirMatriz(matriz2);

        System.out.println("\nProduto das matrizes:");
        exibirMatriz(matrizProduto);

        scanner.close();
	}
	
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[0].length; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }

}
