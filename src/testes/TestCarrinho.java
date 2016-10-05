package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelos.Carrinho;
import modelos.ItemCompra;
import modelos.Produto;

public class TestCarrinho {
	
	Carrinho carrinhoCompras;
	
	@Before
	public void init(){
		
		carrinhoCompras = new Carrinho();
		
		Produto maca = new Produto("Maça",2.00);
		Produto leite = new Produto("Leite",5.00);
		Produto arroz = new Produto("Arroz",10.00);
		Produto feijao = new Produto("Feijão",13.00);
		
		ItemCompra CompraMacas = new ItemCompra(maca,10);
		ItemCompra CompraLeite = new ItemCompra(leite,2);
		ItemCompra CompraArroz = new ItemCompra(arroz,5);
		ItemCompra CompraFeijao = new ItemCompra(feijao,10);

		carrinhoCompras.adicionarItem(CompraMacas);
		carrinhoCompras.adicionarItem(CompraLeite);
		carrinhoCompras.adicionarItem(CompraArroz);
		carrinhoCompras.adicionarItem(CompraFeijao);

	}
	
	@Test
	public void deveRetornarQuantidadeTotalDeItensDoCarrinho(){
		
		assertEquals(carrinhoCompras.getTotalItens(),27);
		
	}
	
	@Test
	public void deveRetornarPrecoTotalAPagar(){
		
		assertEquals(carrinhoCompras.precoTotal(),Double.valueOf(210.00));
		
	}
	
}
