package pacote;

import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {

		System.out.println("Digite a primeira nota:");
		Scanner scan = new Scanner(System.in);
		double primeiraNota = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double segundaNota = scan.nextDouble();
		
		double media = ((primeiraNota + segundaNota)/2);
		
		if (media >= 9 && media <=10)
		{
			System.out.println("Conceito: A");
			System.out.println("A média desse aluno foi: " + media);
			System.out.println("Aprovado");
		}
		else if (media >= 7.5 && media <9)
		{
			System.out.println("Conceito: B");
			System.out.println("A média desse aluno foi: " + media);
			System.out.println("Aprovado");
		}
		
		else if (media >= 6 && media <7.5)
		{
			System.out.println("Conceito: C");
			System.out.println("A média desse aluno foi: " + media);
			System.out.println("Aprovado");
		}
		else if (media >= 4 && media <6)
		{
			System.out.println("Conceito: D");
			System.out.println("A média desse aluno foi: " + media);
			System.out.println("Reprovado");
		}
		else if (media >= 0  && media < 4)
		{
			System.out.println("Conceito: E");
			System.out.println("A média desse aluno foi: " + media);
			System.out.println("Reprovado");
		}
		scan.close();
		
	}
}


