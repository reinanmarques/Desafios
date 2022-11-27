package novosaprendizados.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arredondar {
	public static void main(String[] args) {
		
		BigDecimal valor = BigDecimal.valueOf(1.0);
		BigDecimal valor2 = new BigDecimal("3.0");
		
		BigDecimal divisao = valor.divide(valor2,4, RoundingMode.HALF_UP);
		
		System.out.println("valor da divisão: "+ divisao);
	}

}
