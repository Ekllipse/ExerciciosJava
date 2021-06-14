package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		Produto x = new Produto();
		
		System.out.println("Digite os dados do produto:");
		System.out.printf("Nome: ");
		x.setNome(sc.next());
		System.out.println("Preço: ");
		x.setPreco(sc.nextDouble());
		System.out.println("Quantidade em estoque: ");
		x.AddProduto(sc.nextInt());
		
		
		
		System.out.println(x);
		
		System.out.println("Entre com o numero de produtos que quer adicionar:");
		x.AddProduto(sc.nextInt());
		
		System.out.println(x);
		
		System.out.println("Entre com o numero de produtos que quer adicionar:");
		
		x.RemoveProduto(sc.nextInt());
		
		System.out.println(x);
		
		
		
		
		
		sc.close();

	}

}
