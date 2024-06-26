package exerciciosjava;

public class Ex75 {

	public static void main(String[] args) {
		
	
		int a = 0;
        int b = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

       
        for (int i = 1; i <= 20; i++) {
           
            System.out.print(a + " ");

          
            int proximo = a + b;

           
            a = b;
            b = proximo;
        }

        System.out.println();
	
	
	}

}
