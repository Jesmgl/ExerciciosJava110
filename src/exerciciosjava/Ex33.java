package exerciciosjava;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite o turno do aluno (M - Matutino, V - Vespertino): ");
        char turno = scanner.next().charAt(0);

       
        String saudacao;
        if (turno == 'M') {
            saudacao = "Bom dia, " + nome;
        } else if (turno == 'V') {
            saudacao = "Boa tarde, " + nome;
        } else {
            saudacao = "Turno inválido";
        }

        
        System.out.println(saudacao);

       
        scanner.close();
        

	}

}
