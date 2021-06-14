package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		
		System.out.print("Nome: ");
		f1.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		f1.salarioB = sc.nextDouble();
		System.out.print("Desconto: ");
		f1.taxa = sc.nextDouble();
		
		System.out.println("Funcionario: "+ f1);
		
		System.out.print("Qual vai ser a porcentagem de aumento?");
		
		f1.AumentaSalario(sc.nextDouble());
		
		System.out.println("Atualização do funcionario: " + f1);
		
		
		sc.close();

	}

}
