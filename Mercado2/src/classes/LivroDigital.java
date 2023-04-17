package classes;

import interfaces.Desconto;

public class LivroDigital extends Livro implements Desconto{
	private String formato; 

	public LivroDigital(String nome, int quantidade, int codBarras, int preco, String autor, String formato) {
		super(nome, quantidade, codBarras, preco, autor);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() * (1 - porcentagemDesconto());
	}

	@Override
	public double porcentagemDesconto() {
		return 0.2;		
	}

}
