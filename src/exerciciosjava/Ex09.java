package exerciciosjava;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble();

        taxaJurosMensal = taxaJurosMensal / 100;

        double montante = 0;

        for (int i = 0; i < 12; i++) {
            montante += montante * taxaJurosMensal;
            montante += depositoMensal;
        }

        System.out.printf("O montante após 12 meses é: R$ %.2f%n", montante);

        scanner.close();

	}

}
