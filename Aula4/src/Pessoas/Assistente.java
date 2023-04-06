package Pessoas;

public class Assistente extends OperadorDeCaixa {

	public Assistente(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);

	}

	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.05);
	}
}
