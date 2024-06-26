package exerciciosjava;
import java.util.Scanner;



public class Ex105 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] somaColunas = new int[4]; 

        for (int j = 0; j < 4; j++) { 
            for (int i = 0; i < 4; i++) { 
                somaColunas[j] += matriz[i][j]; 
            }
        }

        System.out.println("Matriz 4x4 informada:");
        exibirMatriz(matriz);

        for (int j = 0; j < 4; j++) {
            System.out.printf("Soma dos elementos da coluna %d: %d\n", j, somaColunas[j]);
        }

        scanner.close();
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
	


