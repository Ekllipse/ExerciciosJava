package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		int n; 
		double somaImposto = 0;
		
		List<Contribuinte> listContribuinte = new ArrayList<>();
		
		System.out.println("Digite o numero de contribuintes");
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n ; i++) {
			char tipoContribuinte;
			String nome;
			double rendaAnual;
			
			System.out.println("Pagador de imposto #" + (i+1));
			System.out.println("Pessoa Fisica ou Juridica (f / j)");
			tipoContribuinte = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			rendaAnual = sc.nextDouble();
			sc.nextLine();
			
			if(tipoContribuinte == 'f') {
				double gSaude;
				
				System.out.println("Digite o gasto com sa?de: ");
				gSaude = sc.nextDouble();
				sc.nextLine();
				
				listContribuinte.add(new PessoaFisica(nome, rendaAnual, gSaude));
			}
			if(tipoContribuinte == 'j') {
				int qtdFuncionarios;
				
				System.out.println("Digite a quantidade de funcioanrios: ");
				qtdFuncionarios = sc.nextInt();
				sc.nextLine();
				
				listContribuinte.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
			}
			
		}
		
		System.out.println("Impostos pagos:");
		
		for (Contribuinte c : listContribuinte) {
			System.out.println(c.getNome() + ": $" + c.CalcImposto());
			somaImposto += c.CalcImposto();
		}
		
		System.out.println("Total de imposto: $" + somaImposto);
		
		
		
		
		sc.close();

	}

}
