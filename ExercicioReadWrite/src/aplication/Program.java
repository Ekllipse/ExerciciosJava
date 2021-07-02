package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		String path = "F:\\WORKSPACE JAVA\\ExercicioReadWrite\\r.csv";
		String pathEscrita;
		int numLinhas = 0;
		File pathEscritaF = new File(path);
		List<Produto> listProd = new ArrayList<>();
		boolean success;
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			listProd.add(new Produto(line.split(",")[0], Double.parseDouble(line.split(",")[1]), Integer.parseInt(line.split(",")[2])));

			while (line != null) {
				numLinhas++;
					line = br.readLine();
				if (line != null) {
					listProd.add(new Produto(line.split(",")[0], Double.parseDouble(line.split(",")[1]), Integer.parseInt(line.split(",")[2])));
				}
				
			}

			System.out.println("Arquivo lido e ele possui: " + numLinhas + " linhas");

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		pathEscrita = pathEscritaF.getParent();
		success = new File(pathEscrita + "\\ArqFinal").mkdir();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathEscrita + "\\ArqFinal\\ArqFinal.csv"))) {
			for(Produto x : listProd) {
				bw.write(x.getNome() + ", " + x.ValorLiq());
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
