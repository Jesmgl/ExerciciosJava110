package exerciciosjava;
import java.util.Scanner;



public class Ex99 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSoma = new int[2][2];

        System.out.println("Digite os valores da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz Soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
	}

}
