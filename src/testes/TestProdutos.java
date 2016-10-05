package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelos.Produto;

public class TestProdutos {
	
	@Test
	public void deveRetornarPrecoUnitarioDoProduto(){
		
		Produto refrigerante = new Produto("Refrigerante",5.00);
		
		assertEquals(refrigerante.getPreco(),Double.valueOf(5.00));
		
	}
	
	@Test
	public void deveRetornarPrecosIguaisProdutosDiferentes(){
		
		Produto maca  = new Produto("Maçã",3.00);
		Produto melao = new Produto("Melão",3.00);
		
		assertEquals(maca.getPreco(),melao.getPreco());
		
	}

}
