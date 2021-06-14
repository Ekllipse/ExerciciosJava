package br.com.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Nome: ");
		f1.nome = sc.next();
		System.out.println("Salario Bruto: ");
		f1.salarioBruto = sc.nextDouble();
		System.out.println("Taxa : ");
		f1.taxa = sc.nextDouble();
		
		System.out.printf("Funcionario: %s, Salario liquido %f\n", f1.nome, f1.SalarioLiq());
		
		System.out.println("Digite a porcentagem de aumento: " );
		
		f1.salarioBruto = f1.AumentaSalario(sc.nextDouble());
		
		System.out.printf("Salario novo liq %f // Salario novo bruto : %f", f1.SalarioLiq(), f1.salarioBruto);
		
		
		sc.close();
	}

}
