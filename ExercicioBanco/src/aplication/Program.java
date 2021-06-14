package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		String nConta;
		String titular;
		String saldoInic;
		
		Conta c1;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero da Conta:" );
		
		nConta = sc.next();
		
		System.out.print("Digite o Titular da conta:");
		titular = sc.next();
		
		System.out.println("Deseja depositar saldo inicial?(Y/N)");
		
		saldoInic = sc.next();
		if (saldoInic.equals("y")) {
			
			System.out.println("Digite o valor inicial:");
			
			c1 = new Conta(nConta,titular, sc.nextDouble());
						
			
		}else {
			
			
			c1 = new Conta(nConta,titular);
			
			
		}
		System.out.println("Dados da conta: \n" + c1);
		
		System.out.print("Entre com o valor do deposito:" );
		c1.Deposito(sc.nextDouble());
		
		System.out.println("Conta atualizada" +c1);
		
		System.out.print("Entre com o valor do Saque: ");
		c1.Saque(sc.nextDouble());
		System.out.println("Conta atualizada " +c1);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
