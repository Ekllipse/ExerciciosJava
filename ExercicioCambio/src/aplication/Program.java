package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cotacao,valorDol;
		
		System.out.print("Qual a cotação do dolar");
		cotacao= sc.nextDouble();
		
			
		System.out.print("Quanto você vai comprar em dolar?");
		
		valorDol= sc.nextDouble();
		
		System.out.print("Você vai pagar:" + Conversao.valorTotal(cotacao, valorDol));
		
		
		sc.close();

	}

}
