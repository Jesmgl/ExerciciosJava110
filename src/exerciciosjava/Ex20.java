package exerciciosjava;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite um numero:");
		int numero = valor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " O numero digitado é par");
		}else {
			System.out.println(numero + " O numero digitado é impar");
		}

	}

}
