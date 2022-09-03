package desafiosBeeCrowd;

import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int hora;
		int minuto;
		

		//System.out.println("Qual a hora inicial");
		int hInicial = t.nextInt();
	//	System.out.println("Qual o minuto inicial");
		int mInicial = t.nextInt();
		//System.out.println("Qual a hora final");
		int hFinal = t.nextInt();
		//System.out.println("Qual o minuto final");
		int mFinal = t.nextInt();
		
		hora = hFinal - hInicial;
		minuto = mFinal - mInicial;
		if(minuto < 0 ) {
			hora = hora + minuto;
			minuto = 60 + minuto;
		}else if(minuto >60){
			hora = 24 - hora + minuto;
			minuto = 60 + minuto;
		}
		
		System.out.println("hora: " +hora);
		System.out.println("minuto: " +minuto);

		//System.out.println("O JOGO DUROU " + " HORA(S) E " + " MINUTO(S)");

		t.close();
	}

}
