package atividade01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		System.out.println("Digite a �rea do quadrado:");

		Scanner leitor = new Scanner(System.in);

		float areadoQuadrado = leitor.nextFloat();

		float resultado = (areadoQuadrado * areadoQuadrado);

		float resultadoemDobro = resultado * 2;

		System.out.println("O dobro da �rea do quadrado �: " + resultadoemDobro);

		leitor.close();
	}
}