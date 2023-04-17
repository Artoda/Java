package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaCorrenteEspecial;
import Contas.ContaPoupanca;
import Contas.ContaPoupancaEspecial;
import Funcionarios.Assistente;
import Funcionarios.Diretor;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;
import Funcionarios.OperadorCaixa;
import Relatorio.Relatorio;

public class Principal {

	public static void main(String[] args) {

		Funcionario OperadorCaixa = new OperadorCaixa("Rogerio", "123-345-556", "1412", 2000);

		Funcionario Assistente = new Assistente("Roberco", "854-522-664", "5289", 2500);

		Funcionario Gerente = new Gerente("Luto", "854-522-664", "951", 3000);

		Funcionario Diretor = new Diretor("Tata", "548-123-486", "658", 4000);
		
		Conta ContaCorrente = new ContaCorrente(52, 2000, 100, 2000);
		
		Conta ContaPoupanca = new ContaPoupanca(85, 3000, 500, 3000);
		
		Conta ContaCorrenteEspecial = new ContaCorrenteEspecial(95, 4000, 1000, 4000);
		
		Conta ContaPoupancaEspecial = new ContaPoupancaEspecial(125, 5000, 2000, 5000);
		
		Relatorio info = new Relatorio();
		info.Relatorios(OperadorCaixa, Assistente, Gerente, Diretor);

		Relatorio infoConta = new Relatorio();
		infoConta.RelatoriosConta(ContaCorrente, ContaPoupanca, ContaCorrenteEspecial, ContaPoupancaEspecial);

		Relatorio relatorioFuncionarioConta = new Relatorio();
		System.out.println("Total de funcionarios:" + relatorioFuncionarioConta.totalFuncionario());
		System.out.println("Total de contas:" + relatorioFuncionarioConta.totalConta());

		List<Funcionario> lista = new ArrayList<>();
		lista.add(new Diretor("Tata", "548-123-486", "658", 4000));
		lista.add(new Gerente("Luto", "854-522-664", "951", 3000));
		lista.add(new OperadorCaixa("Rogerio", "123-345-556", "1412", 2000));
		lista.add(new Assistente("Roberco", "854-522-664", "5289", 2500));
		lista.add(new Diretor("Tatas", "548-123-486", "658", 4000));
		
		Collections.sort(lista);

		System.out.println(lista.get(0).getNome());

		Map<String, Conta> mapaDeContas = new HashMap<>();
		mapaDeContas.put("Diretor", ContaCorrente);
		mapaDeContas.put("Gerente", ContaPoupanca);
		
		Conta contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getConta());

	}

}