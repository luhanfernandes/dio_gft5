package EstruturaRepeticao;

import java.util.Scanner;

public class MaioreMedia {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int contador = 0;
		
		do {
			System.out.println("Digite um valor: ");
			numero = teclado.nextInt();
			soma += numero;
			contador += 1;
			
			if (numero > maior) {
				maior = numero;
			}
			
		} while (contador < 5);
			System.out.println("O maior numero foi: " + maior);
			System.out.println("A media foi de : " + soma / 5);
	}

}
