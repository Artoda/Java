package contas;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;

	public ContaCorrente(int agencia, String titular, double saldo, String tipo, double tarifa, double limite) {
		super(agencia, titular, saldo, tipo);
		this.tarifa = tarifa;
		this.limite = limite;

	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String toString() {
		return "getTarifa()=" + getTarifa() + ", getLimite()=" + getLimite() + ", getSaldo()=" + getSaldo()
				+ ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular()
				+ ", getTipo()=" + getTipo() + "]";
	}

}
