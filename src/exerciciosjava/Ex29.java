package exerciciosjava;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        
        if (nota >= 7.0) {
            System.out.println("Situação do aluno: Aprovado");
        } else {
            System.out.println("Situação do aluno: Em recuperação");
        }

        
        scanner.close();
	}

}
