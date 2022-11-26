package novosaprendizados.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class OperacoesComDatas {
	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(2020, 03, 12);
		LocalDateTime data2 = LocalDateTime.of(2020, 03, 12,02,40);
		Instant data3 = Instant.parse("2022-02-17T01:34:09Z");
		
		LocalDate lastWeeks = data1.minusDays(7);
		LocalDateTime lastWeeksTime = data2.minusDays(7);
		LocalDate nextWeeks = data1.plusDays(7);
		LocalDateTime nextWeeksTime = data2.plusDays(7);
		LocalDateTime nextHours= data2.plusHours(7);
		Instant lastMoths = data3.minus(7,ChronoUnit.DAYS);
		Instant nextMoths = data3.plus(7,ChronoUnit.DAYS);
		
		
		System.out.println(lastWeeks);
		System.out.println(nextWeeks);
		System.out.println(lastWeeksTime);
		System.out.println(nextWeeksTime);
		System.out.println(nextHours);
		System.out.println(lastMoths);
		System.out.println(nextMoths);
		
		// Calculando duracao
		
		Duration dura1 = Duration.between(data2,nextWeeksTime);
		Duration dura2 = Duration.between(lastWeeks.atStartOfDay(),data1.atStartOfDay());
		Duration dura3 = Duration.between(lastMoths,data3);
		
		System.out.println("Duracao LocalDate: "+dura1.toDays()+" dias");
		System.out.println("Duracao LocalDateTime: "+dura2.toDays()+" dias");
		System.out.println("Duracao Instant: "+dura3.toDays()+" dias");
		
	}

}
