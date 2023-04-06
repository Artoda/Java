package contas;

public class ContaCorrenteEspecial extends ContaCorrente {

	public ContaCorrenteEspecial(int agencia, String titular, double saldo, String tipo, double tarifa, double limite) {
		super(agencia, titular, saldo, tipo, tarifa, limite);
		// TODO Auto-generated constructor stub
	}

	private double cartaoCredito;
	private double investimento;


	public double getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

}
