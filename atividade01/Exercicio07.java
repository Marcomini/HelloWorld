package atividade01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		System.out.println("Digite algum n�mero inteiro: ");

		Scanner leitor = new Scanner(System.in);

		int primeiroNumeroInteiro = leitor.nextInt();

		System.out.println("Digite algum n�mero inteiro novamente :");

		int segundoNumeroInteiro = leitor.nextInt();

		System.out.println("Digite algum n�mero real: ");

		float primeiroNumeroReal = leitor.nextFloat();

		int dobro = primeiroNumeroInteiro * 2;

		int metade = segundoNumeroInteiro / 2;

		float somadoTriplo = (primeiroNumeroInteiro * 3) + primeiroNumeroReal;

		float elevadoaoCubo = (primeiroNumeroReal * primeiroNumeroReal * primeiroNumeroReal);

		System.out.println("O dobro do primeiro n�mero �: " + dobro);

		System.out.println("A metade do segundo n�mero �: " + metade);

		System.out.println("A soma do triplo do primeiro com o terceiro n�mero �: " + somadoTriplo);

		System.out.println("O terceiro n�mero elevado ao cubo �: " + elevadoaoCubo);

		leitor.close();
	}
}