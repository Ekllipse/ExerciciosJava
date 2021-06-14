package entities;

public class Funcionario {

	public String nome;
	public double salarioB;
	public double taxa;
	
	public double SalarioLiquido() {
		return salarioB - taxa;
	}
	
	public void AumentaSalario(double aumento) {
		salarioB += salarioB * aumento /100; 
	}
	
	public String toString() {
		return 	nome
				+", $ "
				+SalarioLiquido();				
	}
	
}
