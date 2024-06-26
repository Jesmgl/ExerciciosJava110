package exerciciosjava;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Qual a base do seu triangulo?");
		double base = valor.nextDouble();
		
		System.out.println("Qual a altura do seu triângulo?");
		double altura = valor.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do seu triângulo é: " + area);
		

	}

}
