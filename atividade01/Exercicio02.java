package atividade01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		System.out.println("Digite a área do quadrado:");

		Scanner leitor = new Scanner(System.in);

		float areadoQuadrado = leitor.nextFloat();

		float resultado = (areadoQuadrado * areadoQuadrado);

		float resultadoemDobro = resultado * 2;

		System.out.println("O dobro da área do quadrado é: " + resultadoemDobro);

		leitor.close();
	}
}