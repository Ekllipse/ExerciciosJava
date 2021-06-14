package util;

public class Conversao {
	
	public static double valorTotal(double cotacao, double qtdDolar) {
		return cotacao * qtdDolar + cotacao * (qtdDolar * 6 / 100);
	}

}
