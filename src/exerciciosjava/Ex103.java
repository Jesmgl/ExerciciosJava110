package exerciciosjava;
import java.util.Scanner;



public class Ex103 {

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

        int menorValor = matriz[0][0]; 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                if (matriz[i][j] < menorValor) { 
                    menorValor = matriz[i][j];
                }
            }
        }


        System.out.println("\nMatriz 3x3 informada:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }


        System.out.println("\nO menor valor presente na matriz �: " + menorValor);

        scanner.close();
	}

}
