package exerciciosjava;
import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int somaIdades = 0;
	        int contador = 0;

	        while (true) {
	            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
	            String nome = scanner.nextLine();

	            if (nome.equalsIgnoreCase("fim")) {
	                break;
	            }

	            System.out.print("Digite a idade da pessoa: ");
	            int idade = scanner.nextInt();
	            scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()

	            somaIdades += idade;
	            contador++;
	        }

	        if (contador > 0) {
	            double mediaIdades = somaIdades / (double) contador;
	            System.out.printf("A média das idades das pessoas é: %.2f%n", mediaIdades);
	        } else {
	            System.out.println("Nenhuma idade foi inserida.");
	        }

	        scanner.close();

	}

}
