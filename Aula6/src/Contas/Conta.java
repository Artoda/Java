package Contas;

public abstract class Conta implements CDB {
	protected int numeroConta;
	protected double conta;
	protected double deposito;
	protected double saque;

	public abstract void info();

	public static int totalConta = 0;

	public static int getTotalConta() {
		return totalConta;
	}

	public static void setTotalConta(int totalConta) {
		Conta.totalConta = totalConta;
	}

	public Conta() {

	}

	public Conta(int numeroConta, double conta, double deposito, double saque) {
		Conta.totalConta++;
		this.numeroConta = numeroConta;
		this.conta = conta;
		this.deposito = deposito;
		this.saque = saque;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setConta(double conta) {
		this.conta = conta;
	}

	public double getConta() {
		return (conta + deposito) - saque;
	}

	public void setDeposito(double deposito) {

		this.deposito = deposito;

	}

	public double getDeposito() {
		return deposito;
	}

	public void setSaque(double saque) {

		this.saque = saque;
	}

	public double getSaque() {
		return saque;
	}

	public double CDBs() {
		return getConta() * 0.1;
	}

	public boolean verificaDeposito() {
		if (getDeposito() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verificaSaque() {
		if (getSaque() > conta || getSaque() < 0) {
			return true;

		} else {
			return false;
		}
	}

}
