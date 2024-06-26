package exerciciosjava;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado
		
		// definição de variável do tipo inteiro
		// definição de variável do tipo string
		
		
		
		
		System.out.println("Entre com o primeiro numero: ");
		int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int
		
		System.out.println("Entre com o segundo numero: ");		
		int numero2 = valor.nextInt();// usamos nextInt() para atributos do tipo int
		
		int soma = numero1 + numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		int subtracao = numero1 - numero2;
		System.out.println("a soma dos numeros é: " + soma);
		System.out.println("a multiplicação dos numeros é: " + multiplicacao);
		System.out.println("a divisão dos numeros é: " + divisao);
		System.out.println("a subtração dos numeros é: " + subtracao);

	}

}
