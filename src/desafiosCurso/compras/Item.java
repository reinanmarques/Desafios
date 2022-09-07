package desafiosCurso.compras;

import java.util.ArrayList;
import java.util.List;

public class Item {
	int quantidade ;
	List<Produto> produtos = new ArrayList<>();
	
	void adicionarProduto(Produto prod , int quantidade) {
		for (int i = quantidade; i > produtos.size(); i--) {
			produtos.add(prod);
		}
	}
}
