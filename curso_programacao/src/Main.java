import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double horas;

		nome = sc.next();
		idade = sc.nextInt();
		horas = sc.nextDouble();
		System.out.printf("O nome é %s de idade %d Trabalha: %f", nome, idade, horas);

		sc.close();
	}

}
