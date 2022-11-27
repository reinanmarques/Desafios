package novosaprendizados.bigdecimal;

import java.math.BigDecimal;

public class Metodos {
	public static void main(String[] args) {
		
		BigDecimal valor = BigDecimal.valueOf(0.2);
		BigDecimal valor2 = new BigDecimal("0.1");
		
		
		//Somar
		BigDecimal somar = valor.add(valor2);
		System.out.println("Soma: "+somar);
		
		//Subtrair
		BigDecimal subtrair = valor.subtract(valor2);
		System.out.println("Subtração: "+subtrair);

		//Multiplicar
		BigDecimal multiplicar = valor.multiply(valor2);
		System.out.println("Multiplicação: "+multiplicar);

		//Divisao
		BigDecimal dividir  = valor.divide(valor2);
		System.out.println("Divisão: "+dividir);
		
		
	}

}
