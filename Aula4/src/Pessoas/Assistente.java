package Pessoas;

public class Assistente extends OperadorDeCaixa {

	public Assistente(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);

	}
	public void informacao() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
		System.out.println(this.getMatricula());
	}

	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.05);
	}
}
