package Sistema;

import Contas.Conta;

public class Banco {

	public static void main(String[] args) {
		System.out.println("Sistema Bancário");
		Conta alunos = new Conta();
		// alunos.titular = "Alunos";
		// alunos.depositar(100);
		// alunos.numero = 001;
		// alunos.agencia = 9;
		// alunos.tipo = "Corrente";
		System.out.println("O saldo da conta dos alunos é: " + alunos.titular);

		Conta professor = new Conta(002, 1, "Professor", 100, "Corrente");
		// professor.titular = "Professor";
		// professor.depositar(200);
		// professor.numero = 002;
		// professor.agencia = 10;
		// professor.tipo = "Corrente";
		System.out.println("O saldo da conta do professor é: " + professor.getSaldo());

		// alunos.transferir(professor, 2);
		// professor.depositar(200);
		// professor.sacar(401);
		System.out.println("O saldo da conta do professor é: " + professor.getSaldo());

	}
}
