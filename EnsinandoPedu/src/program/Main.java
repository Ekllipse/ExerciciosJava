package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char str = sc.next().charAt(0);
		
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		int t = sc.nextInt();
		
		double soma = x + y;
	
		
		Math.pow(x, y);
		Math.sqrt(soma);
		
		System.out.println("pedu é gay");
		System.out.printf("O resultado da soma é : %s, %.2f%n", soma,x );
		System.out.println("O resultado da soma é :" + soma);
	
		
		for(int i =0; i > 10 ; i++ ) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
