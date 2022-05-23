package EstruturaRepeticao;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		int nota;
		Scanner teclado = new Scanner (System.in);
		
		while (true) {
			
		System.out.println("Digite uma nota: ");
		nota = teclado.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido! Digite outra nota: ");
			nota = teclado.nextInt();
			
		teclado.close();
			}
		}
	}
}
