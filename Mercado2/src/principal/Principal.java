package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import classes.Livro;
import classes.LivroDigital;
import classes.Notebook;
import classes.Produto;

public class Principal {

	public static void GravarArquivo() throws IOException {
		BufferedWriter arquivo = new BufferedWriter(new FileWriter("C:\\Users\\romul\\Documents\\arquivo.txt", true));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome do Livro: ");
		arquivo.append(scanner.nextLine() + ";");

		System.out.println("Quantidade em estoque: ");
		arquivo.append(Integer.toString(scanner.nextInt()) + ";");

		System.out.println("Cód. Barras: ");
		arquivo.append(Integer.toString(scanner.nextInt()) + ";");

		System.out.println("Preço: ");
		arquivo.append(Integer.toString(scanner.nextInt()) + ";");

		scanner.nextLine();
		System.out.println("Autor");
		arquivo.append(scanner.nextLine() + "\n");
		scanner.close();
		arquivo.close();
	}

	public static void LerArquivo() throws IOException {
		BufferedReader arquivo = new BufferedReader(new FileReader("C:\\Users\\romul\\Documents\\arquivo.txt"));
		String linha;
		Livro livroDoArquivo = null;
		String nome, autor;
		int quantidade, codBarras, preco;

		List<Produto> array = new ArrayList<>();
		while (true) {
			linha = arquivo.readLine();
			String[] arrayStrings;
			if (linha != null) {
				arrayStrings = linha.split(";");
				nome = arrayStrings[0];
				quantidade = Integer.parseInt(arrayStrings[1]);
				codBarras = Integer.parseInt(arrayStrings[2]);
				preco = Integer.parseInt(arrayStrings[3]);
				autor = arrayStrings[4];

				array.add(new Livro(nome, quantidade, codBarras, preco, autor));
				
			} else
				break;
		}

		System.out.println(array.get(0).getNome());
		System.out.println(array.get(0).getQuantidade());
		System.out.println(array.get(0).getCodBarras());
		System.out.println(array.get(0).getPreco());
		System.out.println(((Livro) array.get(0)).getAutor());
	}

	public static void main(String[] args) {
		Livro harrypotter = new Livro("Harry Potter 1", 1, 45654, 50, "JKR");
		Notebook samsung = new Notebook("XPTRO", 1, 6544987, 2500, "Samsung");
		LivroDigital percyJackson = new LivroDigital("Percy Jackson", 2, 21321, 40, "Rick", "pdf");

		List<Produto> carrinho = new ArrayList<>();

		try {
			LerArquivo();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		carrinho.add(percyJackson);
		carrinho.add(samsung);
		carrinho.add(new LivroDigital("Teste", 999999, 2, 45, "Teste", "pdf"));
		carrinho.add(harrypotter);
		Collections.sort(carrinho);
	}

}
