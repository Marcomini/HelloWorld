package atividade01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		System.out.println("Digite o valor em m�tros: ");

		Scanner leitor = new Scanner(System.in);

		float valoremMetros = leitor.nextFloat();

		float cm = valoremMetros * 100;

		System.out.println("O valor em centimetros � " + cm + " cm");

		leitor.close();
	}
}