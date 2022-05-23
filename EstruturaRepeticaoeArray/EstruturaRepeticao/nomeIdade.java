package EstruturaRepeticao;

import java.util.Scanner;

public class nomeIdade {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		
		if(nome.equals("0")){
			break;
		}
		
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		

		teclado.close();
		}
	}
}
