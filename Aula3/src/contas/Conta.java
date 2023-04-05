package contas;

public class Conta {

	protected int numero;
	private int agencia;
	private String titular;
	private double saldo;
	private String tipo;

	private static int totalDeContas = 0;

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}

	public Conta() {
		this.totalDeContas++;
		this.numero = this.totalDeContas;
	}

	public Conta(int agencia, String titular, double saldo, String tipo) {
		this.totalDeContas++;
		this.numero = this.totalDeContas;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;

		System.out.println("Construi minha conta");

	}

	public Conta(int numero, int agencia, String titular, double saldo, String tipo) {
		this.totalDeContas++;
		this.numero = this.totalDeContas;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;

		System.out.println("Construi minha conta");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Seu saldo Ã© insuficiente!");
		} else {
			this.saldo -= valor;
			System.out.println("Seu saldo Ã© de: " + this.saldo);
		}
	}

	public void transferir(Conta contaDestino, double valor) {

		if (this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente!");
		} else {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("Seu saldo é de: " + this.saldo);
		}

	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void imprimir() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	};

}
