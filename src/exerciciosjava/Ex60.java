package exerciciosjava;

public class Ex60 {

	public static void main(String[] args) {
		int limite = 20;
        int contador = 0;
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");

        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            contador++;
        } while (contador < limite);

        System.out.println();

	}

}
