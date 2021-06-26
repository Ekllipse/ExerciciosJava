package aplication;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.en.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String departamento, nome, nivel;
		double salarioBase;
		int nContratos;
		
		Trabalhador pedu;
		
		System.out.print("Entre com o nome do departamento: ");
		departamento = sc.next();
		
		System.out.println("Entre com os dados do Trabalhador");
		
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.print("Nivel: ");
		nivel = sc.next();
		
		System.out.print("Salario Base: ");
		salarioBase = sc.nextDouble();
		
		pedu = new Trabalhador(nome, NivelTrabalhador.valueOf("PLENO"),salarioBase, new Departamento(departamento));
		
		System.out.println("Quanto contratos esse trabalhador tem?");
		nContratos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < nContratos ; i++ ) {
			
			String data;
			double valorHora;
			int horasD;
			
			System.out.print("Data(DD/MM/AAAA): ");
			data = sc.next();
			
			System.out.print("Valor/ Hora: ");
			valorHora = sc.nextDouble();
			
			System.out.print("Duração em horas: ");
			horasD = sc.nextInt();
			
			pedu.AdicionaContrato(new HoraContrato(data, valorHora, horasD));
					
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
