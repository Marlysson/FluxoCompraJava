package modelos;

public class Produto {
	
	private String descricao;
	private Double preco;
	
	public Produto(String descricao , Double preco){
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	
}
