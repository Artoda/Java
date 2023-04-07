package principal;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaCorrenteEspecial;
import contas.ContaPoupanca;
import contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Sistema Bancario");

		Conta conta = new ContaCorrente();
		conta.setTitular("Marcelo");
		conta.setSaldo(5999);
		
		System.out.println("Conta de " + conta.getTitular());
		conta.imprimeExtrato();
	}

}
