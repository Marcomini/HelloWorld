package atividade01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		System.out.println("Vamos calcular a média final dos alunos!");

		System.out.println("========================================");

		System.out.println("digite a primeira nota do aluno:");

		Scanner leitor = new Scanner(System.in);

		byte nota1 = leitor.nextByte();

		System.out.println("digite a segunda nota do aluno:");

		byte nota2 = leitor.nextByte();

		System.out.println("digite a terceira nota do aluno:");

		byte nota3 = leitor.nextByte();

		System.out.println("digite a quarta nota do aluno:");

		byte nota4 = leitor.nextByte();

		int notadosAlunos = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A nota desse aluno(a) foi: " + notadosAlunos);

		{

			leitor.close();
		}

	}
}
