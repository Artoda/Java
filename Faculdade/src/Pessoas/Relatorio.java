package Pessoas;

public class Relatorio {

	public void Relatorios(Empregados... Empregados) {

		double gastosTotais = 0;
		for (Empregados emp : Empregados) {
			System.out.println(emp.getNome() + " " + emp.getGastos());
			gastosTotais += emp.getGastos();
		}
		System.out.println("Gastos totais:" + gastosTotais);

	}

}
