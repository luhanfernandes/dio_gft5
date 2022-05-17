package metodos_java_criacao;

import java.util.Scanner;

public class Horario {
			
public static void mensagem() {
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informa a hora: ");
	int hora = teclado.nextInt();
		
	switch(hora) {
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		System.out.println("Bom dia!");
		break;
	case 13:
	case 14:
	case 16:
	case 17:
	case 18:
		System.out.println("Boa tarde!");
		break;
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
	case 00:
	case 01:
	case 02:
	case 03:
	case 04:
		System.out.println("Boa noite!");
		break;
	}
	
	
	
	
	teclado.close();
}
	
}
