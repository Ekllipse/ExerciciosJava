package entities;

public class PessoaFisica extends Contribuinte {

	private double gSaude;

	public PessoaFisica(String nome, double rendaAnual, double gSaude) {
		super(nome, rendaAnual);
		this.gSaude = gSaude;
	}

	public double getgSaude() {
		return gSaude;
	}

	public void setgSaude(double gSaude) {
		this.gSaude = gSaude;
	}

	@Override
	public double CalcImposto() {
		if(super.getRendaAnual() < 20000.00) {
			return super.getRendaAnual() * 0.15 - 0.5 *gSaude;
		}else {
			return super.getRendaAnual() *- 0.5 *gSaude;
		}
		
	}

}
