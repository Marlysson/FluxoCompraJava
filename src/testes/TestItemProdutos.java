package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelos.ItemCompra;
import modelos.Produto;

public class TestItemProdutos {
	
	Produto maca;
	ItemCompra macas;
	
	@Before
	public void init(){
		
		maca = new Produto("Maça",2.00);
		macas = new ItemCompra(maca,10);
		
	}
	
	@Test
	public void deveRetornarPrecoDoProdutoComprado(){
		
		assertEquals(macas.getProduto().getPreco(),Double.valueOf(2.00));
	}
	
	@Test
	public void deveRetornarPrecoTotalDoItemDaCompra(){
		
		assertEquals(macas.precoTotal(),Double.valueOf(20.00));
		
	}
}
