package exerciciosjava;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Digite o número de maçãs compradas: ");
	        int quantidade = scanner.nextInt();

	        
	        double precoUnitario;
	        if (quantidade < 12) {
	            precoUnitario = 0.50; 
	        } else {
	            precoUnitario = 0.40; 
	        }

	       
	        double valorTotal = quantidade * precoUnitario;

	       
	        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);

	        
	        scanner.close();

	}

}
