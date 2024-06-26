package exerciciosjava;
import java.util.Scanner;
import java.util.Arrays;



public class Ex95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d� nome: ", i + 1);
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfab�tica:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

