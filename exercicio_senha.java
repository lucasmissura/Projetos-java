package Exercicio_senha;

import java.util.Scanner;

public class exercicio_senha {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
	}

}
