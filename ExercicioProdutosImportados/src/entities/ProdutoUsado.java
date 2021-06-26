package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dtFabricacao;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

	public ProdutoUsado(String nome, double preco, Date dtFabricacao) {
		super(nome, preco);
		this.dtFabricacao = dtFabricacao;
	}

	public Date getDtFabricacao() {
		return dtFabricacao;
	}

	public void setDtFabricacao(Date dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}
	
	@Override
	public String TagPreco() {
		return "Nome: " + getNome() + "Preço: " + getPreco() + "Data da Fabricação: "+ sdf.format(dtFabricacao);
	}
}
