package Pessoas;

public class OperadorDeCaixa extends Funcionario {

	public OperadorDeCaixa(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	public double getBonificacao() {
		return super.getBonificacao();
	}
}
