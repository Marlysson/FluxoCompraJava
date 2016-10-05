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
	public void deve_Retornar_Preco_Do_Produto_Comprado(){
		
		assertEquals(macas.getProduto().getPreco(),Double.valueOf(2.00));
	}
	
	@Test
	public void deve_Retornar_Preco_Total_Do_Item_Da_Compra(){
		
		assertEquals(macas.precoTotal(),Double.valueOf(20.00));
		
	}
}
