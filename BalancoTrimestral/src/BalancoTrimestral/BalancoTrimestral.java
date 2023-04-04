package BalancoTrimestral;

import java.util.Scanner;

public class BalancoTrimestral {

	public static void main(String[] args) {	
		
		
		Scanner scanner = new Scanner(System.in);
		int mes1;
		int mes2;
		int mes3;
		System.out.println("Digite o valor do mês de janeiro:");//15000
		mes1 = scanner.nextInt();
		
		System.out.println("Digite o valor do mês de fevereiro:");//23000
		mes2 = scanner.nextInt();
		
		System.out.println("Digite o valor do mês de março:");//17000
		mes3 = scanner.nextInt();
		
		int total= mes1 + mes2 + mes3;
		scanner.close();
		System.out.println("O Balanço Trimestral é:"+ "R$"+total);
		System.out.println("A média arrecadada por mês foi:"+ "R$" +(total/3));

	}
}
