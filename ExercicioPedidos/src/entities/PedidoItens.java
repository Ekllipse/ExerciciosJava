package entities;

public class PedidoItens {
	private int quantidade;
	private double preco;

	private Produto prod;

	public PedidoItens() {
		super();
	}

	public PedidoItens(int quantidade, double preco, Produto prod) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.prod = prod;
	}
	
	

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public Double SubTotal() {
		return prod.getPreco() * quantidade;
	}
}
