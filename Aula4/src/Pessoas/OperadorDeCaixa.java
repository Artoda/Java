package Pessoas;

public class OperadorDeCaixa extends Funcionario {

	public OperadorDeCaixa(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	public double getBonificacao() {
		return super.getBonificacao();
	}

	public void informacao() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
		System.out.println(this.getMatricula());
	}

}
