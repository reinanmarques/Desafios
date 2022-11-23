package desafiosBeeCrowd;

/*
 * Ricardo e Vicente são aficionados por figurinhas. Nas horas vagas, 
 * eles arrumam um jeito de jogar um “bafo” ou algum outro jogo que envolva 
 * tais figurinhas. Ambos também têm o hábito de trocarem as figuras repetidas
 * com seus amigos e certo dia pensaram em uma brincadeira diferente. 
 * Chamaram todos os amigos e propuseram o seguinte: com as figurinhas em mãos, 
 * cada um tentava fazer uma troca com o amigo que estava mais perto seguindo a
 * seguinte regra: cada um contava quantas figurinhas tinha. Em seguida, eles 
 * tinham que dividir as figurinhas de cada um em pilhas do mesmo tamanho, 
 * no maior tamanho que fosse possível para ambos. Então, cada um escolhia uma 
 * das pilhas de figurinhas do amigo para receber. Por exemplo, se Ricardo e 
 * Vicente fossem trocar as figurinhas e tivessem respectivamente 8 e 12 
 * figuras, ambos dividiam todas as suas figuras em pilhas de 4 figuras 
 * (Ricardo teria 2 pilhas e Vicente teria 3 pilhas) e ambos escolhiam uma 
 * pilha do amigo para receber.
 */

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
		int múltiplo = menor; // múltiplo
		
		
		//testa se as cartas são divísiveis pelo pelo múltiplo
		while(objetivo) {
			if(maior%múltiplo == 0 && menor%múltiplo ==0) {
				monte = múltiplo;
				objetivo = false;
			}
			múltiplo--; // decresce o multiplo 
		}
		
		
		System.out.println(monte);
		
		
		
		input.close();
	}	 
}
