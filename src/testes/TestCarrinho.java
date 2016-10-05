package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelos.Carrinho;
import modelos.Produto;

public class TestCarrinho {
	
	Carrinho carrinhoCompras;
	Produto maca;
	
	@Before
	public void init(){
		
		carrinhoCompras = new Carrinho();
		
		maca = new Produto("Maça",2.00);
		
		Produto leite = new Produto("Leite",5.00);
		Produto arroz = new Produto("Arroz",10.00);
		Produto feijao = new Produto("Feijão",13.00);
		
		carrinhoCompras.adicionarItem(maca,10);
		carrinhoCompras.adicionarItem(leite,2);
		carrinhoCompras.adicionarItem(arroz,5);
		carrinhoCompras.adicionarItem(feijao,10);
	}
	
	@Test
	public void deve_Retornar_Quantidade_Total_De_Itens_Do_Carrinho(){
		
		assertEquals(carrinhoCompras.getTotalItens(),27);
		
	}
	
	@Test
	public void deve_Retornar_Preco_Total_A_Pagar(){
		
		assertEquals(carrinhoCompras.precoTotal(),Double.valueOf(210.00));
		
	}
	
	@Test
	public void deve_Retornar_Preco_Correto_Ao_Adicionar_Mesmo_Produto_Ja_No_Carrinho(){
		
		carrinhoCompras.adicionarItem(maca,5);
		
		assertEquals(carrinhoCompras.precoTotal(),Double.valueOf(220.00));
	}
	
	@Test
	public void deve_Retornar_Quantidade_Atualizada_De_Itens_Sendo_Mesmo_Produto(){
		
		carrinhoCompras.adicionarItem(maca,5);
		
		assertEquals(carrinhoCompras.getTotalItens(),32);
		
	}
	
}
