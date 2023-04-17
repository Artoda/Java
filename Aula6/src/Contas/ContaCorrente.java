package Contas;

public class ContaCorrente extends Conta {

	public ContaCorrente() {

	}

	public ContaCorrente(int numeroConta, double conta, double deposito, double saque) {
		super(numeroConta, conta, deposito, saque);

	}

	public double CDBs() {
		return super.CDBs();
	}

	public void info() {

		System.out.println("Numero da conta:" + this.getNumeroConta());
		System.out.println("Valor da conta:" + (this.getConta() + this.CDBs()));
		if (verificaDeposito() == false) {
			System.out.println("Valor do deposito:" + this.getDeposito());
		} else {
			System.out.println("Deposito Invalido");
		}
		if (verificaSaque() == false) {
			System.out.println("Valor do Saque:" + this.getSaque());
		} else {
			System.out.println("Saque Invalido");
		}

	}
}
