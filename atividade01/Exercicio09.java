package atividade01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		System.out.println("Quanto você ganha por hora? ");

		Scanner leitor = new Scanner(System.in);

		float valorGanhoporHora = leitor.nextFloat();

		System.out.println("Quantas horas você trabalhou ou trabalha no mês? ");

		float horasTrabalhadas = leitor.nextFloat();

		float salario = valorGanhoporHora * horasTrabalhadas;

		System.out.println("O seu salario deve ser de igual a R$:" + salario + " por mês");

		leitor.close();
	}
}