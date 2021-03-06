package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		List<Produto> listProd = new ArrayList<>();
		int n;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println("Digite o numero de produtos: ");		
		n = sc.nextInt();
		sc.nextLine();
		for(int i =0 ; i<n; i++) {
			String nome;
			String tipoProduto;
			double preco;
			
			System.out.println("Produto #"+ (i+1));
			System.out.println("Comum, Usado ou Importado( c / u / i ): ");
			tipoProduto = sc.next();
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			System.out.print("Pre?o: ");
			preco = sc.nextDouble();
			sc.nextLine();
			
			if(tipoProduto.equals("c"))  {
				listProd.add(new Produto(nome, preco));
			}else if(tipoProduto.equals("u")) {
				Date dataFab;
				System.out.println("Digite a data de fabrica??o(DD/MM/YYYY): ");
				dataFab = sdf.parse(sc.next());
				listProd.add(new ProdutoUsado(nome, preco, dataFab));
			}else if(tipoProduto.equals("i")) {
				double txAlfandega;
				System.out.println("Taxa da alfandega: ");
				txAlfandega = sc.nextDouble();
				listProd.add(new ProdutoImportado(nome, preco, txAlfandega));
			}
					
						
		}
		
		System.out.println("Tag de pre?o: ");
		for(Produto juan : listProd) {
			System.out.println(juan.TagPreco());
		}
		
		sc.close();
		
		

	}

}
