package atividade01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		System.out.println("Insira o valor do raio:");

		Scanner leitor = new Scanner(System.in);
		float valordoRaio = leitor.nextFloat();

		float valorArea = (float) (Math.PI * (valordoRaio * valordoRaio));

		System.out.println("O valor da área é:" + valorArea);
		leitor.close();

	}
}