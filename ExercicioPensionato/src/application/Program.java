package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Quantos quartos ser?o alugado? ");
		
		int n=sc.nextInt();
		sc.nextLine();
		
		Estudantes [] vect= new Estudantes[n];
		Livro[] livro = new Livro[2] ;

		
		for(int i =0; i<vect.length; i++) {
			
			System.out.println("Aluguel #" + (i+1));
			
			
			System.out.print("Nome do vagabundo");
			String nome = sc.nextLine();
			
			
			System.out.print("Email");
			String email = sc.nextLine();
			
			System.out.println("Qual quarto voc? deseja ficar?");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			vect[i] = new Estudantes(nome,email,quarto);
			
		}
		
		System.out.println("Quartos ocupados: ");
		for(Estudantes e : vect) {
			
			
			System.out.println("Quarto: " + e.getQuarto() + "| " + e.getNome() +", email :" + e.getEmail());
		}
		
		System.out.println("Digite os livros dos Estudantes: ");
		
		for(int t = 0 ; t< vect.length ; t++) {
			
			
			for(int fl = 0; fl < livro.length; fl++) {
				String nomeLivro = sc.nextLine();
				
				livro[fl] = new Livro(nomeLivro);

			}
			vect[t].setLivros(livro);
			
		}
		
		for(Estudantes e : vect) {
			
			
			System.out.println("Quarto: " + e.getQuarto() + "| " + e.getNome() +", email :" + e.getEmail());
			
			for(Livro a : livro) {
				System.out.println("Livros do estudante " + e.getNome()+ ": " + a.getNomeLivro()  );
			}
		}
			
		
		sc.close();
		

	}

}
