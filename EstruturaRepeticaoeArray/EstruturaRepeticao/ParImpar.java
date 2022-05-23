package EstruturaRepeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int numero;
		
		while (true) {
			System.out.println("Digite um numero: ");
			numero = teclado.nextInt();
			if (numero == 999) {
				break;
			} else {
				if (numero % 2 == 0) {
					par += 1;
				} else {
					impar += 1;
				}
			}
			
		}
		teclado.close();
		System.out.println("Tivemos " + par + " numero pares");
		System.out.println("Tivemos " + impar + " numeros impares");
		
	}
}
