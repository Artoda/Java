package Funcionarios;

public class OperadorCaixa extends Funcionario {

	public OperadorCaixa() {

	}

	public OperadorCaixa(String nome, String cpf, String matricula, double salario) {
		super(nome, cpf, matricula, salario);
	}

	public double getBonificacao() {
		return super.getBonificacao();
	}

	public void info() {
		System.out.println("Nome:" + this.getNome());
		System.out.println("CPF:" + this.getCpf());
		System.out.println("Matricula:" + this.getMatricula());
		System.out.println("SalarioBase:" + this.getSalario());
		System.out.println("Bonifição:" + this.getBonificacao());
		System.out.println("Salario:" + (this.getSalario() + this.getBonificacao()));

	}

	@Override
	public int compareTo(Funcionario o) {
		if (this.getNome().compareTo(o.getNome()) < 0) {

			return -1;

		} else if (this.getNome().compareTo(o.getNome()) > 0) {

			return 1;

		} else {

			if (this.getSalario() < o.getSalario()) {
				return -1;
			} else if (this.getSalario() < o.getSalario()) {
				return 1;
			} else {
				return 0;
			}

		}

	}

}
