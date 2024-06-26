package exerciciosjava;
import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int somaPares = 0;

        do {
            if (contador % 2 == 0) {
                somaPares += contador;
            }
            contador++;
        } while (contador <= numero);

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + somaPares);


	}

}
