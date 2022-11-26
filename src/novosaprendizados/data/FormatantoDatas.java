package novosaprendizados.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatantoDatas {

	public static void main(String[] args) {
		
		LocalDate data1 = LocalDate.of(2020, 03, 12);
		LocalDateTime data2 = LocalDateTime.of(2020, 03, 12,02,40);
		Instant data3 = Instant.parse("2022-02-17T12:34:09Z");
		
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.systemDefault());
		
		System.out.println("Data formatada: "+ data1.format(ftm1));
		System.out.println("Data formatada: "+ data2.format(ftm2)); 
		System.out.println("Data formatada: "+ ftm3.format(data3)); 
	}
}
