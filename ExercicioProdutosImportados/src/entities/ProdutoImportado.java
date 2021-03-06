package entities;

public class ProdutoImportado extends Produto{
	private double txAlfandega;

	public ProdutoImportado(String nome, double preco, double txAlfandega) {
		super(nome, preco);
		this.txAlfandega = txAlfandega;
	}
	
	
	
	public double getTxAlfandega() {
		return txAlfandega;
	}



	public void setTxAlfandega(double txAlfandega) {
		this.txAlfandega = txAlfandega;
	}

	public double ValorTotal() { 
		return getPreco() - getTxAlfandega();
	}

	@Override
	public String TagPreco() {
		return "Nome: " + getNome() + " Pre?o: " + getPreco()   + ValorTotal() + " Taxa alfandega: "+ getTxAlfandega() ;
	}
	
	
	
}
