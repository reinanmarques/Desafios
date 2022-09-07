package desafiosCurso.compras;

public class ClienteTest {
	public static void main(String[] args) {

		Produto prod1 = new Produto("Martelo", 23.4);
		Produto prod2 = new Produto("Quita", 67.5);
		Produto prod3 = new Produto("Furadeira", 45.3);

		Item item1 = new Item();
		Item item2 = new Item();
		
		item1.adicionarProduto(prod3, 3);
		item1.adicionarProduto(prod2, 2);
		item2.adicionarProduto(prod1, 1);
		item2.adicionarProduto(prod3, 5);
		
		Compra compra1 = new Compra(item1,item1);
		Compra compra2 = new Compra(item2,item1);
		
		
		Cliente pedro = new Cliente("Pedro");
		Cliente ana = new Cliente("Ana");
		Cliente maria = new Cliente("Maria");
		
		
		pedro.fazerCompra(compra1);
		
		System.out.println(pedro.valorFinalDaCompra());	

	}
}
