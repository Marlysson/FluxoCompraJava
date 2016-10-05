package modelos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<ItemCompra> itensCarrinho;
	
	public Carrinho(){
		this.itensCarrinho = new ArrayList<ItemCompra>();
	}
	
	public void adicionarItem(ItemCompra itemCompra){
		this.itensCarrinho.add(itemCompra);
	}
	
	
	public int getTotalItens() {
		
		int quantidadeTotal = 0;
		
		for (ItemCompra itemCompra : itensCarrinho) {
			quantidadeTotal += itemCompra.getQuantidade();
		}
		
		return quantidadeTotal;
	}
	
	
	public Double precoTotal(){
		
		Double precoTotal = 0.0;
		
		for (ItemCompra itemCompra : itensCarrinho) {
			
			precoTotal += itemCompra.precoTotal();
			
		}
		
		return precoTotal;
	}
	
}
