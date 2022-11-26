package novosaprendizados.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapeandoProduto {
	public static void main(String[] args) {
		List<Produto> prods = new ArrayList<>();
		
		String path = "C:\\Users\\wesle\\OneDrive\\Documentos\\in.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				String[] vect = line.split(",");
				String nome = vect[0];
				int qtd= Integer.parseInt(vect[1].trim());
				double preco = Double.parseDouble(vect[2]);
				
				prods.add(new Produto (nome,qtd,preco));
				line = bf.readLine();
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		prods.stream().map(p -> p.getNome()).forEach(System.out::println);
	}

}
