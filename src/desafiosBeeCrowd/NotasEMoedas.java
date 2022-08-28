package desafiosBeeCrowd;

/*
 * Leia um valor de ponto flutuante com duas casas decimais.
 *  Este valor representa um valor monetário. A seguir, 
 * calcule o menor número de notas e moedas possíveis no qual
 *  o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 
 * 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05
 *  e 0.01. A seguir mostre a relação de notas necessárias.
 */
import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
		int[] qtdNotas = new int[6];
		int[] qtdMoedas = new int[6];
		double numero;
		System.out.print("Digite seu Dinheiro: ");
		numero = t.nextDouble(); // pegar numero do

		for (int i = 0; i < notas.length; i++) {

			if (numero >= notas[i]) {
				int div = (int) numero / notas[i];
				qtdNotas[i] = div;
				numero -= div * notas[i];
			}
		}
		
		for (int i = 0; i < moedas.length; i++) {

			if (numero >= moedas[i]) {
				int divMoedas = (int) (numero / moedas[i]);
				qtdMoedas[i] = divMoedas;
				numero = numero - divMoedas * moedas[i];
			}
		}
		System.out.println("NOTAS:");
		System.out.println(qtdNotas[0] + " nota(s) de R$ 100.00");
		System.out.println(qtdNotas[1] + " nota(s) de R$ 50.00");
		System.out.println(qtdNotas[2] + " nota(s) de R$ 20.00  ");
		System.out.println(qtdNotas[3] + " nota(s) de R$ 10.00");
		System.out.println(qtdNotas[4] + " nota(s) de R$ 5.00");
		System.out.println(qtdNotas[5] + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(qtdMoedas[0] + " moeda(s) de R$ 1.00");
		System.out.println(qtdMoedas[1] + " moeda(s) de R$ 0.50");
		System.out.println(qtdMoedas[2] + " moeda(s) de R$ 0.25");
		System.out.println(qtdMoedas[3] + " moeda(s) de R$ 0.10");
		System.out.println(qtdMoedas[4] + " moeda(s) de R$ 0.05");
		System.out.println(qtdMoedas[5] + " moeda(s) de R$ 0.01");

		t.close();
	}

}
