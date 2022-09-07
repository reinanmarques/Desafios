package desafiosCurso.compras;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();

	public Compra(Item item, Item item2) {
		this.itens.add(item);
		this.itens.add(item2);
	}

}
