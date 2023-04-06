package Pessoas;

public class Diretor extends Gerente {

	public Diretor(String nome, String cpf, double salario, String matricula, int senha) {
		super(nome, cpf, salario, matricula, senha);

	}

	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.10);
	}
}
