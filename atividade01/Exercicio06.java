package atividade01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		System.out.println("Digite algum n�mero: ");

		Scanner variaveldeApoio = new Scanner(System.in);

		int numeroDigitadoPeloUsuario = variaveldeApoio.nextInt();

		System.out.println("Voc� digitou o n�mero: " + numeroDigitadoPeloUsuario);

		variaveldeApoio.close();

	}

}