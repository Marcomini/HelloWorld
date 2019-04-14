package pacote;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		System.out.println("Digite o primeiro lado do triângulo:");
		Scanner scan = new Scanner (System.in);
		int primeiroLado = scan.nextInt();
		
		System.out.println("Digite o segundo lado do triângulo:");
		int segundoLado = scan.nextInt();
		
		System.out.println("Digite o terceiro lado do triângulo:");
		int terceiroLado = scan.nextInt();
		
		
		 if (primeiroLado == segundoLado && segundoLado == terceiroLado)
	{
		System.out.println("Triângulo equilátero");
	}
		 else if (primeiroLado != segundoLado && segundoLado != terceiroLado)
			{
				System.out.println("Triângulo escaleno ");
			}
		 else if ((primeiroLado + segundoLado) > terceiroLado || (primeiroLado + terceiroLado) > segundoLado ||
					(segundoLado + terceiroLado) > primeiroLado)
				{
					System.out.println("Triângulo isósceles");
				}
		
		
		
		else {
				System.out.println();
		}
		 scan.close();
	}

}
