package br.com.projetojava.Main;

import java.util.Locale;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/* primeiro exercicio
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		
		int soma=x + y ;
		
		System.out.println("A soma de x e y é :" + soma);
		*/
		
		/*Exercicio 2
		double raio = sc.nextDouble();
		double pi = 3.14;
		
		double area = pi * Math.pow(raio, raio);
		
		System.out.println("Area:" + area);
		*/
		/*Exercicio 3
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("Diferenca" + diferenca);
		
		*/
		/* Exercicio 4
		String funcionario = sc.next();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = horas * valorHora;
		
		System.out.printf("%s recebe %.2f", funcionario, salario);
		
		*/
		
		String codP1 = sc.next();
		int qtdP1 = sc.nextInt();
		double valorP1 = sc.nextDouble();
		
		String codP2 = sc.next();
		int qtdP2 = sc.nextInt();
		double valorP2 = sc.nextDouble();
		
		valorP1 = valorP1 * qtdP1;
		valorP2 = valorP2 * qtdP2;
		
		
		double valorTotal = valorP1 + valorP2;
		
		System.out.println("Valor total = " + valorTotal);
		
		
		
		sc.close();
		
	}

}
