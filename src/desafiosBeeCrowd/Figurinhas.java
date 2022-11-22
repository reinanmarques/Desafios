package desafiosBeeCrowd;

import java.util.Scanner;

public class Figurinhas {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Numero 1:");
		int nDeCartasJogador = input.nextInt();
		input.nextLine();
		System.out.println("Numero 2:");
		int nDeCartasOponete = input.nextInt();
		
		int monte = 0;
		
		int maior = nDeCartasJogador > nDeCartasOponete
				? nDeCartasJogador: nDeCartasOponete;
		int menor = nDeCartasJogador < nDeCartasOponete
				? nDeCartasJogador: nDeCartasOponete;
		
		boolean objetivo = true;
		int x = menor; 
		while(objetivo) {
			if(maior%x == 0 && menor%x ==0) {
				monte = x;
				objetivo = false;
			}
			x--;
		}
		
		
		System.out.println(monte);
		
		
		
		input.close();
	}	 
}
