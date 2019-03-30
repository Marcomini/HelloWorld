package exercíciosSimples;
import java.util.Scanner;
public class MédiadosAlunos {

	public static void main(String[] args) {
		System.out.println("Vamos calcular a média final dos alunos!");
		System.out.println("========================================");
		
		System.out.println("digite a primeira nota do aluno:");
		Scanner variaveldeApoio01 = new Scanner (System.in);
		byte nota1 = variaveldeApoio01.nextByte();
		
		System.out.println("digite a segunda nota do aluno:");
		Scanner variaveldeApoio02 = new Scanner (System.in);
		byte nota2 = variaveldeApoio02.nextByte();
		
		System.out.println("digite a terceira nota do aluno:");
		Scanner variaveldeApoio03 = new Scanner (System.in);
		byte nota3 = variaveldeApoio03.nextByte();
		
		System.out.println("digite a quarta nota do aluno:");
		Scanner variaveldeApoio04= new Scanner (System.in);
		byte nota4 = variaveldeApoio04.nextByte();
		
		int notadosAlunos = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A nota desse aluno(a) foi: " + notadosAlunos);
		{
		variaveldeApoio01.close();
		variaveldeApoio02.close();
		variaveldeApoio03.close();
		variaveldeApoio04.close();
		}
	}

}
