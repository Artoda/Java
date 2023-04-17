package Relatorio;

import Contas.*;
import Funcionarios.*;

public class Relatorio {

	public void Relatorios(Funcionario... funcionarios) {

		for (Funcionario emp : funcionarios) {
			
			emp.info();
			System.out.println("\n--------------\n");
		}
	}

	public void RelatoriosConta(Conta... contas) {
		for (Conta emp : contas) {
			;
			emp.info();
			System.out.println("\n--------------\n");
		}
	}

	public double totalFuncionario() {
		return Funcionario.getTotalFuncionario();
	}

	public double totalConta() {
		return Conta.getTotalConta();
	}
}
