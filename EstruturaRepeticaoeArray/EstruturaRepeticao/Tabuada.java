package EstruturaRepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = teclado.nextInt();
		
		System.out.println("Tabuada de " + tabuada);
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
	}

}
