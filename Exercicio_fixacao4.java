package exercicio_fixacao4;

import java.util.Scanner;

public class Exercicio_fixacao4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int álcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			if (tipo == 1) {
					álcool = álcool + 1;
			}
			
			else if (tipo == 2) {
					gasolina = gasolina + 1;
			}
			
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + álcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}

}
