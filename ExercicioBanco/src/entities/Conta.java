package entities;

public class Conta {
	
	private String numeroConta;
	private String titularConta;
	private double saldo;
	
	public Conta(String numeroConta, String titularConta, double depInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		Deposito(depInicial);;
	}

	public Conta(String numeroConta, String titularConta) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = 0;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void Deposito(double valorDep) {
		this.saldo += valorDep;
	}
	
	public void Saque(double valorSaq) {
		this.saldo -= valorSaq + 5.00;
	}
	
	public String toString() {
		return "Conta "
				+ getNumeroConta()
				+ ", Titular: "
				+ getTitularConta()
				+ ", Saldo: "
				+ getSaldo();
	}

}
