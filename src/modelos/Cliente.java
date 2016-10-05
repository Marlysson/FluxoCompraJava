package modelos;

public class Cliente {
	
	private String nome;
	private int idade;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}
	
}
