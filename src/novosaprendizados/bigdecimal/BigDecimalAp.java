package novosaprendizados.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalAp {
	public static void main(String[] args) {
		
		// Formas de Instanciar
		BigDecimal valor = BigDecimal.valueOf(0.2);
		BigDecimal valor2 = new BigDecimal("0.1");
		
		double v1 = 0.2;
		double v2 = 0.1;
		
		System.out.println(valor.add(valor2));
		System.out.println(v1+v2);
	}
}
