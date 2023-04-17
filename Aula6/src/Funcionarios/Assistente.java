package Funcionarios;

public class Assistente extends OperadorCaixa {
	
	public Assistente() {

	}

	public Assistente(String nome, String cpf, String matricula, double salario) {
		super(nome, cpf, matricula, salario);
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.03);
	}

	public void info() {
		System.out.println("Nome:" + this.getNome());
		System.out.println("CPF:" + this.getCpf());
		System.out.println("Matricula:" + this.getMatricula());
		System.out.println("SalarioBase:" + this.getSalario());
		System.out.println("Bonifição:" + this.getBonificacao());
		System.out.println("Salario:" + (this.getSalario() + this.getBonificacao()));

	}

}
