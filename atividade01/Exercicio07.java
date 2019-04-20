package atividade01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		System.out.println("Digite algum número inteiro: ");

		Scanner leitor = new Scanner(System.in);

		int primeiroNumeroInteiro = leitor.nextInt();

		System.out.println("Digite algum número inteiro novamente :");

		int segundoNumeroInteiro = leitor.nextInt();

		System.out.println("Digite algum número real: ");

		float primeiroNumeroReal = leitor.nextFloat();

		int dobro = primeiroNumeroInteiro * 2;

		int metade = segundoNumeroInteiro / 2;

		float somadoTriplo = (primeiroNumeroInteiro * 3) + primeiroNumeroReal;

		float elevadoaoCubo = (primeiroNumeroReal * primeiroNumeroReal * primeiroNumeroReal);

		System.out.println("O dobro do primeiro número é: " + dobro);

		System.out.println("A metade do segundo número é: " + metade);

		System.out.println("A soma do triplo do primeiro com o terceiro número é: " + somadoTriplo);

		System.out.println("O terceiro número elevado ao cubo é: " + elevadoaoCubo);

		leitor.close();
	}
}