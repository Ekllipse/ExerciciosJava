package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		// Declaração do vetor
		int n= sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
		for(int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();	
			media += vect[i] / vect.length;
		}
		
		System.out.println("A Media de alturas é:" + media);
		
		
		
		sc.close();

	}

}
