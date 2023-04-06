package Principal;

import Pessoas.Empregados;
import Pessoas.Professores;
import Pessoas.Relatorio;

public class Principal {

	public static void main(String[] args) {

		Empregados professor = new Professores();
		professor.setNome("Buiua");
		professor.setSalario(78000);
		((Professores) (professor)).setHorasDeAula(200);
		System.out.println(professor.toString());
		
		Relatorio teste = new Relatorio();
		teste.Relatorio(professor);

	}

}
