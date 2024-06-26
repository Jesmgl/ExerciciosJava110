package exerciciosjava;
import java.util.Scanner;



public class Ex97 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("Digite os valores da matriz 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) { 
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                soma += matriz[i][j];
            }
        }

        System.out.println("Matriz 2x2 informada:");
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println("Soma dos elementos da matriz: " + soma);

        scanner.close();
	}

}
