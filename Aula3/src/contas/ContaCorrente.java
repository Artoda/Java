package contas;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;

	public ContaCorrente(int agencia, String titular, double saldo, String tipo, double tarifa, double limite) {
		super(agencia, titular, saldo, tipo);
		this.tarifa = tarifa;
		this.limite = limite;

	}

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
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

	public void imprimeExtrato() {
		// SimpleDataFormat sdf = new SimpleDataFormat("dd/MM/aaaa");
		// Data data = new Data();
		System.out.println("Titular:" + this.getTitular());
		System.out.println("Saldo:" + this.getSaldo());

	}

	public void programaSocial() {

	}

}
