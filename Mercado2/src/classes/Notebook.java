package classes;

import interfaces.Desconto;

public class Notebook extends Produto implements Desconto{
	private String marca;
	
	public Notebook(String nome, int quantidade, int codBarras, int preco, String marca) {
		super(nome, quantidade, codBarras, preco);
		
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() * (1 - porcentagemDesconto());
	}

	@Override
	public double porcentagemDesconto() {		
		return 0.1;
	}

}
