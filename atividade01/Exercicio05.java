package atividade01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		System.out.println("Digite o valor em Celsius: ");

		Scanner leitor = new Scanner(System.in);

		int valoremCelsius = leitor.nextInt();

		int valoremFahrenheit = (valoremCelsius * 9 / 5) + 32;

		System.out.println("A temperatura é de " + valoremFahrenheit + "°F");

		leitor.close();

	}
}