package entities;

public class PessoaJuridica extends Contribuinte {

	private int numFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double CalcImposto() {
		if(numFuncionarios > 10) {
			return super.getRendaAnual() * 0.14;
		}else {
			return super.getRendaAnual() * 0.16;
		}
		
	}

}
