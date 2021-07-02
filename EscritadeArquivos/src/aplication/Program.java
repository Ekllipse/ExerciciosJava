package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String path = "F:\\WORKSPACE JAVA\\EscritadeArquivos\\out.txt";
		Scanner sc = null;
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
	
			sc = new Scanner(System.in);
			System.out.println("Escreva no arquivo: ");
			bw.write(sc.nextLine());
			bw.newLine();
		
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally{
			if(sc != null) {
				sc.close();
			}
		}

		

	}

}
