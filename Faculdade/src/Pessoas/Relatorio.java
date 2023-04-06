package Pessoas;

public class Relatorio {
	
	public static void Relatorio(Empregados... Empregados) {
		
		double gastosTotais = 0;
		for (Empregados emp : Empregados) {
			System.out.println(emp.getNome()+ emp.getGastos());
			gastosTotais += emp.getGastos();
		}
		System.out.println(gastosTotais);
		
	}

}
