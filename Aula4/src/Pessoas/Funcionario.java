package Pessoas;

public abstract class Funcionario implements Bonicacao {

	protected String nome;
	protected String cpf;
	protected double salario;
	protected String matricula;

	public abstract void informacao();

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, double salario, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.matricula = matricula;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public void salario(double salario) {
		this.salario = salario;
	}

}
