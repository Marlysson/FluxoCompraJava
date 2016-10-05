package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelos.Produto;

public class TestProdutos {
	
	@Test
	public void deve_Retornar_Preco_Unitario_Do_Produto(){
		
		Produto refrigerante = new Produto("Refrigerante",5.00);
		
		assertEquals(refrigerante.getPreco(),Double.valueOf(5.00));
		
	}
	
	@Test
	public void deve_Retornar_Precos_Iguais_Com_Produtos_Diferentes(){
		
		Produto maca  = new Produto("Maçã",3.00);
		Produto melao = new Produto("Melão",3.00);
		
		assertEquals(maca.getPreco(),melao.getPreco());
		
	}

}
