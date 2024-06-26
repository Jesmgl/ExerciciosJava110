package exerciciosjava;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        
	        char conceito;
	        if (nota >= 9.0 && nota <= 10.0) {
	            conceito = 'A';
	        } else if (nota >= 7.5 && nota < 9.0) {
	            conceito = 'B';
	        } else if (nota >= 6.0 && nota < 7.5) {
	            conceito = 'C';
	        } else if (nota >= 4.0 && nota < 6.0) {
	            conceito = 'D';
	        } else if (nota >= 0.0 && nota < 4.0) {
	            conceito = 'E';
	        } else {
	            conceito = '*'; 
	        }

	       
	        switch (conceito) {
	            case 'A':
	                System.out.println("Conceito: A - Excelente");
	                break;
	            case 'B':
	                System.out.println("Conceito: B - Bom");
	                break;
	            case 'C':
	                System.out.println("Conceito: C - Regular");
	                break;
	            case 'D':
	                System.out.println("Conceito: D - Insuficiente");
	                break;
	            case 'E':
	                System.out.println("Conceito: E - Muito Insuficiente");
	                break;
	            default:
	                System.out.println("Nota fora da faixa esperada.");
	                break;
	        }

	        
	        scanner.close();

	}

}
