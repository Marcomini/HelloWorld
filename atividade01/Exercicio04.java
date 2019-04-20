package atividade01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		System.out.println("Digite o valor em farenheit: ");

		Scanner leitor = new Scanner(System.in);

		int valorDigitadoEmFarenheit = leitor.nextInt();

		int celsius = 5 * (valorDigitadoEmFarenheit - 32) / 9;

		System.out.println("A temperatura é de " + celsius + "°C");

		leitor.close();

	}
}