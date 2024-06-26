package exerciciosjava;

public class Ex45 {

	public static void main(String[] args) {
		int limite = 20;
        int contador = 0;
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        
        while (contador < limite) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            contador++;
        }
        
        System.out.println();

	}

}
