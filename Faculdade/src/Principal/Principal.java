package Principal;

import java.io.IOException;

import Pessoas.Empregados;
import Pessoas.Professores;
import Pessoas.Relatorio;
import io.Escritor;

public class Principal {

	public static void main(String[] args) throws IOException {

		Empregados professor = new Professores("Carlos", 5000, 200);

		Empregados professor2 = new Professores("Carlá", 6000, 15000);

		System.out.println(professor2.getInfo());

		Relatorio relatorio = new Relatorio();
		relatorio.Relatorios(professor, professor2);
		
		

	}

}
