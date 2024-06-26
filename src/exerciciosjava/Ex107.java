package exerciciosjava;
import java.util.Scanner;



public class Ex107 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int produtoDiagonalSecundaria = 1;

        for (int i = 0; i < 3; i++) {
            produtoDiagonalSecundaria *= matriz[i][2 - i];
        }

        System.out.println("\nMatriz 3x3 informada:");
        exibirMatriz(matriz);

        System.out.println("\nProduto dos elementos da diagonal secund�ria: " + produtoDiagonalSecundaria);

        scanner.close();
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
