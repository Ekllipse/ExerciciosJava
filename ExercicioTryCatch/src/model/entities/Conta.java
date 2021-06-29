package model.entities;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta () {
		
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void Deposito(Double valor) {
		saldo += valor; 
	}
	
	public void Saque(Double valor) throws DomainException {
		if((saldo- valor) < 0) {
			throw new DomainException("Saldo Insificiente!");
		}
		if(valor > limiteSaque) {
			throw new DomainException("Valor de saque é maior que o limite de saque!");
		}
		saldo -= valor;  
	}
	
	
}
