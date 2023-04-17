package Principal;

import Pessoas.Assistente;
import Pessoas.Diretor;
import Pessoas.Funcionario;
import Pessoas.Gerente;
import Pessoas.OperadorDeCaixa;
import Relatorios.FolhaPagamento;

public class Principal {

	public static void main(String[] args) {
		try {
			Funcionario funcionario = new OperadorDeCaixa("Claudio", "165-333", 2000, null);
			funcionario.getBonificacao();
			funcionario.informacao();

			Funcionario operadorDeCaixa = new OperadorDeCaixa("Claudio", "165-333", 3000, null);
			operadorDeCaixa.getBonificacao();
			System.out.println(operadorDeCaixa.getBonificacao());
			operadorDeCaixa.informacao();

			Funcionario assistente = new Assistente("Claudio", "165-333", 4000, null);
			assistente.getBonificacao();
			System.out.println(assistente.getBonificacao());
			assistente.informacao();
			Funcionario gerente = new Gerente("Claudio", "165-333", 5000, null, 0);
			gerente.getBonificacao();
			System.out.println(gerente.getBonificacao());
			gerente.informacao();
			Funcionario diretor = new Diretor("Claudio", "165-333", 6000, null, 0);
			diretor.getBonificacao();
			System.out.println(diretor.getBonificacao());
			diretor.informacao();
			FolhaPagamento fp = new FolhaPagamento();
			System.out.println("Pagamento: " + fp.calculaFolhaPagamento(diretor));
		} catch (Exception e) {
			
		} finally {
			System.out.println("Tudo certo meu xuxu!!");
		}
	}

}
