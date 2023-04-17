package Tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("Digite o número para fazer a tabuada dele:");
		numero = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= 10; i++)
			System.out.println(numero * i);

	}
}
