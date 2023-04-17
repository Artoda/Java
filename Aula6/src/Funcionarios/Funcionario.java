package Funcionarios;

public abstract class Funcionario implements Beneficio, Comparable<Funcionario> {
	protected String nome;
	protected String cpf;
	protected String matricula;
	protected double salario;

	public abstract void info();
	
	public static int totalFuncionario = 0;
	
	public static int getTotalFuncionario() {
		return totalFuncionario;
	}
	
	public static void setTotalFuncionario(int totalFuncionario) {
		Funcionario.totalFuncionario = totalFuncionario;
	}

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, String matricula, double salario) {
		Funcionario.totalFuncionario++;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario*0.01;
	}
	
}
