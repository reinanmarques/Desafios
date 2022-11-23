package desafiosBeeCrowd;

/*
 * Verifique se um numero é primo
 */

import java.util.Scanner;

public class PrimoRápido {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		
		Integer numero = input.nextInt();
		if(isPrime(numero)){
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
				
		input.close();
	}
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}

}
