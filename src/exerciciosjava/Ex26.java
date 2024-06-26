package exerciciosjava;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1, 2, 3): ");
        int codigoProduto = scanner.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        switch (codigoProduto) {
            case 1:
                precoUnitario = 10.0; 
                break;
            case 2:
                precoUnitario = 15.0; 
                break;
            case 3:
                precoUnitario = 20.0; 
                break;
            default:
                System.out.println("Código de produto inválido.");
                return; 
        }

        double valorTotal = precoUnitario * quantidade;

        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);
        scanner.close();

	}

}
