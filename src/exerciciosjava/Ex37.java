package exerciciosjava;

public class Ex37 {

	public static void main(String[] args) {
		int contador = 1;
        int soma = 0;

        while (contador <= 100) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
