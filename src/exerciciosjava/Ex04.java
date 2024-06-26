package exerciciosjava;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		 Scanner valor = new Scanner(System.in);
		 
	        System.out.print("Digite a primeira nota (peso 2): ");
	        double nota1 = valor.nextDouble();

	        System.out.print("Digite a segunda nota (peso 3): ");
	        double nota2 = valor.nextDouble();

	        System.out.print("Digite a terceira nota (peso 5): ");
	        double nota3 = valor.nextDouble();

	       
	        int peso1 = 2;
	        int peso2 = 3;
	        int peso3 = 5;

	       
	        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

	       
	        System.out.println("A média ponderada é: " + mediaPonderada);

	}

}
