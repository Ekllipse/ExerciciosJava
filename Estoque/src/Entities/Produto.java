package Entities;

public class Produto {

	private String nome;
	private double preco;
	private int qtd;
	
	
	
	public Produto() {
		super();
	}
	

	public Produto(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}


	public double ValorTotalEstoque() {
		
		
		return this.preco * this.qtd;
	}
	
	public void AddProduto(int quantidade) {
		this.qtd += quantidade;
		
	}
	
	public void RemoveProduto(int quantidade) {
		this.qtd -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $"
				+ String.format("%.2f", preco)
				+ ", "
				+ qtd
				+ "unidades, Total: "
				+ String.format("%.2f",ValorTotalEstoque());
	}


	
}


