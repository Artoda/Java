package Meses;

public class Meses {
	private double janeiro;
	private double fevereiro;
	private double marco;
	private double abril;
	private double maio;
	private double junho;
	private double julho;

	public Meses() {
		System.out.println("O objeto foi criado");
	}

	public Meses(double janeiro, double fevereiro, double marco) {
		this.janeiro = janeiro;
		this.fevereiro = fevereiro;
		this.marco = marco;
	}

	public Meses(double janeiro, double fevereiro, double marco, double abril, double maio, double junho,
			double julho) {
		this.janeiro = janeiro;
		this.fevereiro = fevereiro;
		this.marco = marco;
		this.abril = abril;
		this.maio = maio;
		this.junho = junho;
		this.julho = julho;
	}

	public double totaltri() {
		double totaltris = janeiro + fevereiro + marco + abril + maio + junho + julho;
		return totaltris;
	}

}
