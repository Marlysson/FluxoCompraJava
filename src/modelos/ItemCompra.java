package modelos;

public class ItemCompra {
	
	private Produto produto;
	private int quantidade;
	
	public ItemCompra(Produto produto , int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Double precoTotal() {
		return this.produto.getPreco() * this.quantidade;
	}
}
