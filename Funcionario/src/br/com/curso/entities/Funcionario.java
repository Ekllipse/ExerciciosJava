package br.com.curso.entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto, taxa;
	
	
	public double SalarioLiq(){
		return (salarioBruto - taxa);
	}
	
	public double AumentaSalario(double percentual) {
		return (this.salarioBruto + (salarioBruto * (percentual /100)));
	}
	
}
