package classes;

public class Livro extends Produto {
	private String autor;

	public Livro(String nome, int quantidade, int codBarras, int preco, String autor) {
		super(nome, quantidade, codBarras, preco);
		
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}
	
}
