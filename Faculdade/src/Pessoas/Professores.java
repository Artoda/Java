package Pessoas;

public class Professores extends Empregados {
	protected double horasDeAula;

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
	public String toString() {
		return "Professores [horasDeAula=" + horasDeAula + ", nome=" + nome + ", salario=" + getGastos() + "]";
	}

}
