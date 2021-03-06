package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		int n;
		double percentual;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quanto funcionario ser?o registrados?");
		n = sc.nextInt();
		sc.nextLine();
		int idAumento;
		for(int f = 0; f<n; f++) {
			int idF;
			String nome;
			double salario;
			
			System.out.println("Funcionario #" + (f+1));
			
			System.out.println("Id: ");
									
			idF = sc.nextInt();
			while(IdExistente(list, idF)){
				System.out.println("Este id ja existe");
				idF = sc.nextInt();
				
			}
						
			System.out.println("Nome: ");
			sc.nextLine();
			nome = sc.next();
			
			System.out.println("Salario: ");
			salario = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Funcionario(idF, nome, salario));
						

			}
		System.out.println("Digite o id do funcionario que vai receber aumento");
		idAumento = sc.nextInt();
		sc.nextLine();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Funcionario n?o existe");
		}else {
			System.out.println("Digite o percentua"
					+ "l de aumento:");
			percentual = sc.nextDouble();
			sc.nextLine();
			func.AumentaSalario(percentual);
		}
		
		for(Funcionario f : list) {
			System.out.println(f.getId() + ", " + f.getNome() + ", " + f.getSalario());
		}
		
		
		

		sc.close();
			
		}
	
		public static boolean IdExistente(List<Funcionario> list,int id ) {
			Funcionario x = list.stream().filter( y -> y.getId() == id).findFirst().orElse(null);
			return x != null;
		}

		

	}


