package novosaprendizados.bigdecimal;

import java.math.BigDecimal;

public class Convereter {
	public static void main(String[] args) {
		BigDecimal valor = BigDecimal.valueOf(4.2);
		BigDecimal valor2 = BigDecimal.valueOf(10.2);
		
		//convertendo para int 
		int valorInt = valor.intValue();
		System.out.println("Int: "+valorInt);
		
		//convertendo para long
		long valorLong = valor2.longValue();
		System.out.println("Long: "+valorLong);

		//convertendo para double
		double valorDouble = valor2.doubleValue();
		System.out.println("Double: "+valorDouble);
		
		//convertendo para String
		String valorString = valor.toPlainString();
		System.out.println("String: "+ valorString);
	}

}
