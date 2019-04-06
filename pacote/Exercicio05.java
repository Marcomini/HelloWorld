package pacote;

import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		System.out.println("Digite aqui a primeira nota do aluno: ");
		Scanner scan = new Scanner(System.in);
		byte primeiraNotadoAluno = scan.nextByte();
		
		System.out.println("Digite aqui a segunda nota do aluno: ");
		byte segundaNotadoAluno = scan.nextByte();
		
		byte mediadasNotas = (byte) ((primeiraNotadoAluno + segundaNotadoAluno)/2);
		
		
		
		
		if(mediadasNotas == 10)
		{
		System.out.println("Aprovado com distinção");
		System.out.println("Sua média final foi " + mediadasNotas);
		}
		else if (mediadasNotas >= 7)
		{
		System.out.println("Aprovado");
		System.out.println("Sua média final foi " + mediadasNotas);
		}
		else 
		{
		System.out.println("Reprovado");
		System.out.println("Sua média final foi " + mediadasNotas);
		}
		scan.close();
	}
}

	


