package Pessoas;

public class Professores extends Empregados {
	protected double horasDeAula;

	public Professores() {

	}

	public Professores(String nome, double salario, double horasDeaula) {
		super(nome, salario);
		this.horasDeAula = horasDeaula;
	}

	public double getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(double horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	public double somaHora() {
		return horasDeAula * 10;
	}

	public double getGastos() {
		return super.getSalario() + somaHora();
	}

	@Override
	public String getInfo() {
		return super.getInfo() + " " + "Horas de aulas=" + horasDeAula;
	}

}
