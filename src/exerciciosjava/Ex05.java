package exerciciosjava;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Qual o preço do produto comprado?");
		double preco = valor.nextDouble();
		
		System.out.println("Qual a quantidade comprada?");
		double quantidade = valor.nextDouble();
		
		double total = preco * quantidade;
		
		if(quantidade >= 10) {
			total -= total * 0.10;
			
			System.out.println("O valor total a ser pago é " + total);
		} else {
			System.out.println("O valor total a ser pago é " + total);
		}

	}

}
