package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItens;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		String nome, email,  statusPedido;
		Date dtAniversario;
		Date dtAtual = new Date();
		int nItens;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		Pedido order;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		nome = sc.next();
		sc.nextLine();

		System.out.print("Email: ");
		email = sc.next();

		System.out.print("Data do aniversario (DD/MM/YYYY): ");
		dtAniversario = sdf.parse(sc.next());

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status do pedido: ");
		statusPedido = sc.next();

		System.out.println("Quantos itens terão no pedido?");
		nItens = sc.nextInt();
		sc.nextLine();
		
		order = new Pedido(dtAtual, StatusPedido.valueOf(statusPedido), new Cliente(nome, email,dtAniversario));

		for (int i = 0; i < nItens; i++) {
			String pNome;
			double pPreco;
			int quantidade;

			System.out.print("Nome do produto: ");
			pNome = sc.next();

			System.out.print("Preco do produto: ");
			pPreco = sc.nextDouble();

			System.out.print("Quantidade: ");
			quantidade = sc.nextInt();
			
			Produto prod = new Produto(pNome, pPreco);
			
			PedidoItens pItens = new PedidoItens(quantidade, pPreco, prod);

			
			order.AdicionaItem(pItens);
		}
		
		
		
		
		System.out.println("Resumo do Pedido");
		System.out.println(order);

		sc.close();

	}

}
