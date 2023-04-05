package Principal;

import Pessoas.Gerente;

public class Principal {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Claudio", "165-333", 2);
		System.out.println(gerente.getNome());
		
	}
}
