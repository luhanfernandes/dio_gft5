package metodos_java_criacao;

import java.util.Scanner;

public class Calculadora {
	
	public static void somar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double numero1 = teclado.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double numero2 = teclado.nextDouble();
		
		double soma = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma);
		
		teclado.close();
		
	}
	
	public static void subtrair() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double numero1 = teclado.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double numero2 = teclado.nextDouble();
		
		double subtracao = numero1 - numero2;
		System.out.println("A diferença entre " + numero1 + " e " + numero2 + " = " + subtracao);
		
		teclado.close();
	}
	
	public static void multipricar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double numero1 = teclado.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double numero2 = teclado.nextDouble();
		
		double multiplicacao = numero1 * numero2;
		System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " = " + multiplicacao);
		
		teclado.close();
	
}
	
	public static void dividir() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		double numero1 = teclado.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double numero2 = teclado.nextDouble();
		
		double divisao = numero1 / numero2;
		System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " = " + divisao);
		
		teclado.close();
	
	}
}