package principal;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaCorrenteEspecial;
import contas.ContaPoupanca;
import contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Sistema Bancario");

		// TUDO CONTA
		ContaPoupanca aluno = new ContaPoupanca(); 
		ContaCorrente aluno2 = new ContaCorrente(); 
		ContaPoupancaEspecial aluno3 = new ContaPoupancaEspecial(); 
		ContaCorrenteEspecial aluno4 = new ContaCorrenteEspecial(); 

		aluno.setRendimento(2);
		aluno.getNumero();
		aluno2.getNumero();
		aluno2.setTarifa(1);
		aluno3.setPoupanca(5);
		aluno4.setInvestimento(10);
		System.out.println(aluno.getRendimento()); 
		System.out.println(Conta.getTotalDeContas());		
		System.out.println(aluno2.getTarifa());
		System.out.println(aluno3.getPoupanca());
		System.out.println(aluno4.getInvestimento());
//		Conta alunos = new Conta();
//		alunos.setAgencia(1);
//		alunos.setTitular("Alunos");
//		alunos.depositar(10000.0);
//		alunos.setTipo("Corrente");
//		System.out.println("O saldo da conta alunos é: " + alunos.getNumero());
//		
//		Conta professor = new Conta(1, "Professor", 100.0, "Corrente");
//		professor.setAgencia(1);
//		professor.setTitular("Professor");
//		professor.depositar(100.0);
//		professor.setTipo("Corrente");
//		System.out.println("O saldo da conta professor é: " + professor.getNumero());
//		
//		alunos.transferir(professor, 5000);
//		System.out.println("O saldo da conta professor é: " + professor.getSaldo());
//		professor.depositar(0);
//		professor.sacar(0);
//		System.out.println("O saldo da conta professor é: " + professor.getNumero());
//	
	}

}
