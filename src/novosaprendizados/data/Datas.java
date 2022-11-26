package novosaprendizados.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		DateTimeFormatter ftmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 =  LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 =  LocalDate.parse("2022-04-13");
		LocalDateTime d05 = LocalDateTime.parse("2022-03-12T12:09:06");
		Instant d06 = Instant.parse("2022-07-12T23:04:08-03:00");
		
		LocalDateTime d09 = LocalDateTime.parse("17/02/2003 17:30", ftmt2);
		LocalDate d07 =  LocalDate.parse("17/02/2003", ftmt);
		LocalDate d10 =  LocalDate.of(2003, 02, 17);
		
		
		
		System.out.println("Data Local sem h/: "+ d01);
		System.out.println("Data Local com h/: "+ d02);
		System.out.println("Data global com f/: "+ d03);
		System.out.println("Passando data L sem h/: "+d04);
		System.out.println("Passando data L com h/: "+d05);
		System.out.println("Passando data G com f/: "+ d06);
		System.out.println("Formatando data L sem h/: "+d07);
		System.out.println("Formatando data L com h/: "+d09);
		System.out.println("Usando 'of' L p/ passar data: "+d10);
	}

}
