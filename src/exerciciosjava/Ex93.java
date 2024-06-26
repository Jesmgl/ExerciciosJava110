package exerciciosjava;
import java.util.Scanner;



public class Ex93 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.printf("Quantidade de n�meros no intervalo de 10 a 50: %d%n", contador);

        scanner.close();
	}

}
