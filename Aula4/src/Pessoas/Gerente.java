package Pessoas;

public class Gerente extends Assistente {

	protected int senha;
	protected int numeroFuncionarios;

	public Gerente(String nome, String cpf, double salario, String matricula, int senha) {
		super(nome, cpf, salario, matricula);
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.15);
	}
}
