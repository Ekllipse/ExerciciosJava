package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		
		String path = "F:\\WORKSPACE JAVA\\LeituradeArquivo\\in.txt";

		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
