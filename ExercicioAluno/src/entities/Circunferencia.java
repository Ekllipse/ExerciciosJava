package entities;

import util.Calculator;

public class Circunferencia {
	public double raio;
	
	Calculator calc = new Calculator();
	
	
	public double setVolume() {
		return calc.volume();
	}
}
