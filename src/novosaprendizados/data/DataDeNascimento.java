package novosaprendizados.data;

import java.time.Duration;
import java.time.LocalDate;

public class DataDeNascimento {
	public static void main(String[] args) {
		
		LocalDate dataAgora = LocalDate.now();
		LocalDate dataDeNascimento = LocalDate.of(2003, 02, 17);
		
		
		Duration anos = Duration.between(dataDeNascimento.atStartOfDay(),dataAgora.atStartOfDay());
		
		System.out.println("Minha idade: "+anos.toDays()/365);
		
	}

}
