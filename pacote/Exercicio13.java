package pacote;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {

		System.out.println("Digite algum n�mero entre 1 e 7 que corresponder� a dia da semana: ");
		Scanner scan = new Scanner(System.in);
		byte diadaSemana = scan.nextByte();
	
		switch (diadaSemana)
		{
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda-feira");break;
		case 3: System.out.println("Ter�a-feira");break;
		case 4: System.out.println("Quarta-feira");break;
		case 5: System.out.println("Quinta-feira");break;
		case 6: System.out.println("Sexta-feira");break;
		case 7: System.out.println("S�bado");break;
		default : System.out.println("Valor inv�lido");break;
		}
		scan.close();
}}
