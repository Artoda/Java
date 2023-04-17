package mercado;

import classes.Produto;

public class Leitor {

	public void VerPreco(Produto produto) {
		System.out.println("Esse produto custa: " + produto.getPreco());		
	}

}