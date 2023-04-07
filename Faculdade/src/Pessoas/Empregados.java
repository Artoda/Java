package Pessoas;

public class Empregados {
	protected String nome;
	protected double salario;

	public Empregados() {

	}

	public Empregados(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getGastos() {
		return getSalario();
	}

	public String getInfo() {
		return "Nome=" + nome + ", Salario=" + getGastos() + ",";
	}

}
