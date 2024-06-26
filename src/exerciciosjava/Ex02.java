package exerciciosjava;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = valor.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("A área do circulo é: " + area);
		System.out.println("O perímetro do circulo é: " + perimetro);
		
		
	}

}
