package classes;

public abstract class Produto implements Comparable<Produto>{
	private String nome;
	private int quantidade;
	private int codBarras;
	private double preco;
	
	public Produto(String nome, int quantidade, int codBarras, int preco) {		
		this.nome = nome;
		this.quantidade = quantidade;
		this.codBarras = codBarras;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public double getPreco() {
		return preco;
	}
		
	public int compareTo(Produto produtoPassadoPorParametro) {		
		if(this.getNome().compareTo(produtoPassadoPorParametro.getNome()) < 0)
			return -1;
		else if (this.getNome().compareTo(produtoPassadoPorParametro.getNome()) > 0)
			return 1;
		else
			return 0;
	}
	
}
