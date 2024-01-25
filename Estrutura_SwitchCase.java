package estrutura_SwitchCase;

import java.util.Scanner;

public class Estrutura_SwitchCase {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		
		case 2:
			dia = "Segunda-feira";
			break;
		
		case 3:
			dia = "Terça-feira";
			break;
		
		case 4:
			dia = "Quarta-feira";
			break;
		
		case 5:
			dia = "Quinta-feira";
			break;
			
		case 6:
			dia = "Sexta-feira";
			break;
			
		case 7:
			dia = "Sábado";
			break;
			
		default:
			dia = "Valor invalído";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
