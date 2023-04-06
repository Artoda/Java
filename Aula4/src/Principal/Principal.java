package Principal;

import Pessoas.Assistente;
import Pessoas.Diretor;
import Pessoas.Funcionario;
import Pessoas.Gerente;
import Pessoas.OperadorDeCaixa;
import Relatorios.FolhaPagamento;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Claudio", "165-333", 2000, null);
		funcionario.getBonificacao();
		System.out.println(funcionario.getBonificacao());

		Funcionario operadorDeCaixa = new OperadorDeCaixa("Claudio", "165-333", 3000, null);
		operadorDeCaixa.getBonificacao();
		System.out.println(operadorDeCaixa.getBonificacao());

		Funcionario assistente = new Assistente("Claudio", "165-333", 4000, null);
		assistente.getBonificacao();
		System.out.println(assistente.getBonificacao());

		Funcionario gerente = new Gerente("Claudio", "165-333", 5000, null, 0);
		gerente.getBonificacao();
		System.out.println(gerente.getBonificacao());

		Funcionario diretor = new Diretor("Claudio", "165-333", 6000, null, 0);
		diretor.getBonificacao();
		System.out.println(diretor.getBonificacao());

		FolhaPagamento fp = new FolhaPagamento();
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(diretor));

	}

}
