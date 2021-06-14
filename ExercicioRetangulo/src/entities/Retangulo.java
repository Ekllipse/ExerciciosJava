package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double Area() {
		return altura * largura;
	}
	
	public double Perimetro() {
		return 2* (altura + largura);
	}
	
	public double Diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f%n", Area())
				+"Perimetro = "
				+ String.format("%.2f%n", Perimetro())
				+"Diagonal = "
				+String.format("%.2f%n", Diagonal());
	}

}
