package exerciciosjava;
import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para a tabuada: ");
        int numero = scanner.nextInt();
        
        int contador = 1;
        
        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);
        
        scanner.close();

	}

}
