package model.program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.entities.DomainException;

public class Aplication {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Integer numeroConta;
		String titular;
		Double saldoInic, limiteSaq;
		Conta fiveS;
		
		try {
		System.out.println("**Bem vindo ao Banco FiveStar**");
		System.out.println("Digite os dados da conta:");
		System.out.print("Numero da conta:");
		numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o Titular da conta:");
		titular = sc.nextLine();
		
		System.out.print("Saldo inicial:");
		saldoInic = sc.nextDouble();
		
		System.out.println("Limite de Saque");
		limiteSaq = sc.nextDouble();
		
		fiveS = new Conta(numeroConta, titular, saldoInic,limiteSaq);
		
		
		System.out.print("Digite o valor do saque");
		fiveS.Saque(sc.nextDouble());
		
		System.out.print("Novo saldo:" + fiveS.getSaldo());
		
		
		
		}catch(DomainException e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Formato de entrada inválida");
		}
		sc.close();
	}

}
