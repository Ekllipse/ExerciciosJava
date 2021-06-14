package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		x.altura = sc.nextDouble();
		x.largura = sc.nextDouble();
		
		System.out.println(x);
		
		
		
		sc.close();

	}

}
