package novosaprendizados.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDatas {
	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(2020, 03, 12);
		LocalDateTime data2 = LocalDateTime.of(2020, 03, 12,02,40);
		Instant data3 = Instant.parse("2022-02-17T01:34:09Z");
		
		LocalDate d1 = LocalDate.ofInstant(data3, ZoneId.systemDefault());
		LocalDate d2 = LocalDate.ofInstant(data3, ZoneId.of("Portugal"));
		LocalDateTime d3 = LocalDateTime.ofInstant(data3, ZoneId.systemDefault());
		LocalDateTime d4 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));
		
		
		
		System.out.println("Data convertida System: "+d1);
		System.out.println("Data convertida Portugal: "+d2);
		System.out.println("Data convertida System: "+d3);
		System.out.println("Data convertida Portugal: "+d4);

		System.out.println("Dia : "+data1.getDayOfMonth());
		System.out.println("Mês : "+d4.getMonthValue());
		System.out.println("Ano : "+d4.getYear());
		System.out.println("Hora : "+data2.getHour());
		System.out.println("Minuto : "+d4.getMinute());
	}

}
