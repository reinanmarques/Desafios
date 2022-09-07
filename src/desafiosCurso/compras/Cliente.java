package desafiosCurso.compras;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void fazerCompra(Compra compra){
		this.compras.add(compra);
	}
	
	double valorFinalDaCompra(){
		double total = 0;
		for (Compra compra : compras) {
			for(Item item: compra.itens) {
				for(Produto produto : item.produtos) {
					total +=produto.preco;
				}
			}
		}
		return total;
	}
}
