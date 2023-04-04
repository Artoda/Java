package Contas;

public class Conta {

	public int numero;
	public String titular;
	public int agencia;
	private double saldo;
	public String tipo;

	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, String titular, double saldo, String tipo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
		System.out.println("Criei lá conta");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Deposito invalido");
		}
	};

	public void sacar(double valor) {
		if (valor < saldo || valor > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Sacamento invalido");
		}
	};

	public void transferir(Conta D, double valor) {
		if (this.saldo < valor || valor < 0) {
			System.out.println("Seu saldo é não o bastante");
		} else {
			this.saldo -= valor;
			D.saldo += valor;
			System.out.println("Seu saldo ficou: " + this.saldo);
		}
	};

	public void imprimir() {
	};

	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	};

}
