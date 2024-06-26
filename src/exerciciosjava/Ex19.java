package exerciciosjava;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = valor.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = valor.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		double nota3 = valor.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		if(media >= 7) {
			System.out.println("O aluno está aprovado:" + media);
		} else {
			System.out.println("O aluno está reprovado:" + media);
		}
	}

}
