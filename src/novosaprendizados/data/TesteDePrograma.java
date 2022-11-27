package novosaprendizados.data;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class TesteDePrograma {
	
	public static void main(String[] args) {
		
		
		String data = JOptionPane.showInputDialog("Digite sua data de Nascimento");
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataDeNascimento =null;
		try {
			dataDeNascimento = LocalDate.parse(data,fmt);
			Duration idade = Duration.between(dataDeNascimento
					.atStartOfDay(), LocalDate.now().atStartOfDay());
			
			JOptionPane.showMessageDialog(null, "Sua idade é "+ idade.toDays()/365);
		}catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "Digite a data com /");
		}
		
		
		
	}

}
