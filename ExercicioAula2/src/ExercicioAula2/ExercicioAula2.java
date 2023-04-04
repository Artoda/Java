package ExercicioAula2;

import java.util.Scanner;

public class ExercicioAula2 {

	public static void main(String[] args) {

		OperacoesSimples();
		Prioridade();
		DivisoesInteiras();
		PotenciaRaiz();
		TrocaVariavel();
		MaioridadePenal();
		AlturaMedia();
		QuantosDias();
		LojaFerramentas();
	}

	public static void OperacoesSimples() {
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2;
		System.out.println("Digite o numero que você quer:");
		numero1 = scanner.nextDouble();
		System.out.println("Digite o segundo número:");
		numero2 = scanner.nextDouble();
		scanner.close();
		double soma, sub, div, mult;
		soma = numero1 + numero2;
		sub = numero1 - numero2;
		div = numero1 / numero2;
		mult = numero1 * numero2;

		System.out.println("\n" + "A soma é:" + soma + "\n");
		System.out.println("A subtração é:" + sub + "\n");
		System.out.println("A divisão é:" + div + "\n");
		System.out.println("A multiplicação é:" + mult + "\n");

	}

	public static void Prioridade() {
		double resultado = 5 + 4 * 2;
		System.out.println(resultado);
		double resultado2 = (5 + 4) * 2;
		System.out.println(resultado2);
		double resultado3 = 1 + 2 / 3 * 4;
		System.out.println(resultado3);
		double resultado4 = (1 + 2) / (3 * 4);
		System.out.println(resultado4);
	}

	public static void DivisoesInteiras() {
		Scanner scanner = new Scanner(System.in);
		double metadeInteiro, resto, valor;
		System.out.println("Digite o número:");
		valor = scanner.nextDouble();
		scanner.close();
		metadeInteiro = valor / 2;
		resto = valor % 2;
		System.out.println("A metade do número é:" + metadeInteiro);
		System.out.println("O resto da divisão por 3 é:" + resto);

	}

	public static void PotenciaRaiz() {
		Scanner scanner = new Scanner(System.in);
		double valor, potencia, raizQuadrada;
		System.out.println("Digite o número:");
		valor = scanner.nextDouble();
		scanner.close();
		potencia = Math.pow(valor, 5);
		raizQuadrada = Math.sqrt(valor);
		System.out.println("A potencia do número é:" + potencia);
		System.out.println("A raiz quadrada do número é:" + raizQuadrada);
	}

	public static void TrocaVariavel() {
		Scanner scanner = new Scanner(System.in);
		double a, b, aux;
		System.out.println("Digite o valor da variavel A:");
		a = scanner.nextDouble();
		System.out.println("Digite o valor da variavel B:");
		b = scanner.nextDouble();
		scanner.close();
		aux = a;
		a = b;
		b = aux;

		System.out.println("A=" + a);
		System.out.println("B=" + b);
	}

	public static void MaioridadePenal() {
		Scanner scanner = new Scanner(System.in);
		double idade;
		System.out.println("Digite sua idade:");
		idade = scanner.nextDouble();
		scanner.close();
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
	}

	public static void AlturaMedia() {
		Scanner scanner = new Scanner(System.in);
		double altura1, altura2, altura3;
		System.out.println("Digite a primeira altura:");
		altura1 = scanner.nextDouble();
		System.out.println("Digite a segunda altura");
		altura2 = scanner.nextDouble();
		System.out.println("Digite a terceira altura");
		altura3 = scanner.nextDouble();
		scanner.close();
		double mediaAltura;
		mediaAltura = (altura1 + altura2 + altura3) / 3;
		System.out.println("A média das alturas é:" + mediaAltura);

	}

	public static void QuantosDias() {
		Scanner scanner = new Scanner(System.in);
		double anoAtual, quantidadeAnos, dias;
		System.out.println("Escreva o ano atual:");
		anoAtual = scanner.nextDouble();
		scanner.close();
		quantidadeAnos = anoAtual / 4;
		dias = (anoAtual - 1) * 365 + quantidadeAnos;
		System.out.printf("Já se passaram:" + dias + " " + "dias desde 01/01/0001");
	}

	public static void LojaFerramentas() {
		Scanner scanner = new Scanner(System.in);
		double percoParafuso = 1.50;
		double percoArruela = 2.00;
		double percoPorca = 2.50;
		int quantidadeParafuso, quantidadeArruela, quantidadePorca;
		double totalParafuso, totalArruela, totalPorca, totalPagar;
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		System.out.println("\nDigite a quantidade de parafusos que você quer:");
		quantidadeParafuso = scanner.nextInt();
		System.out.println("\nDigite a quantidade de Arruelas que você quer:");
		quantidadeArruela = scanner.nextInt();
		System.out.println("\nDigite a quantidade de Porcas que você quer:");
		quantidadePorca = scanner.nextInt();
		scanner.close();

		totalParafuso = percoParafuso * quantidadeParafuso;
		totalArruela = percoArruela * quantidadeArruela;
		totalPorca = percoPorca * quantidadePorca;
		totalPagar = totalParafuso + totalArruela + totalPorca;

		System.out.println(totalPagar);
	}
}
