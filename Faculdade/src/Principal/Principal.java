package Principal;

import Pessoas.Empregados;
import Pessoas.Professores;
import Pessoas.Relatorio;

public class Principal {

	public static void main(String[] args) {

		Empregados professor = new Professores("Carlos", 5000, 200);

		Empregados professor2 = new Professores("Carlá", 6000, 15000);

		System.out.println(professor2.getInfo());

		Relatorio relatorio = new Relatorio();
		relatorio.Relatorios(professor, professor2);

	}

}
