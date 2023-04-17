package contas;

public class ContaPoupanca extends Conta {

	private double rendimento;
	

	public double getRendimento(){
		
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public void imprimeExtrato() {
		System.out.println("Titular:" + this.getTitular());
		System.out.println("Saldo:" + this.getSaldo());
		
	}

	public void programaSocial() {
		// TODO Auto-generated method stub
		
	}

}
