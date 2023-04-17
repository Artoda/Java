package Principal;

import java.util.Scanner;

import Meses.Meses;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double mes11;
		double mes12;
		double mes13;
		double mes14;
		double mes15;
		double mes16;
		double mes17;
		mes11 = scanner.nextInt();
		mes12 = scanner.nextInt();
		mes13 = scanner.nextInt();
		mes14 = scanner.nextInt();
		mes15 = scanner.nextInt();
		mes16 = scanner.nextInt();
		mes17 = scanner.nextInt();
		scanner.close();

		Meses meses = new Meses(mes11, mes12, mes13);
		System.out.println(meses.totaltri());

		Meses mes = new Meses(mes11, mes12, mes13, mes14, mes15, mes16, mes17);
		System.out.println(mes.totaltri());

	}
}
