package pacote;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		System.out.println("Digite o primeiro lado do tri�ngulo:");
		Scanner scan = new Scanner (System.in);
		int primeiroLado = scan.nextInt();
		
		System.out.println("Digite o segundo lado do tri�ngulo:");
		int segundoLado = scan.nextInt();
		
		System.out.println("Digite o terceiro lado do tri�ngulo:");
		int terceiroLado = scan.nextInt();
		
		
		 if (primeiroLado == segundoLado && segundoLado == terceiroLado)
	{
		System.out.println("Tri�ngulo equil�tero");
	}
		 else if (primeiroLado != segundoLado && segundoLado != terceiroLado)
			{
				System.out.println("Tri�ngulo escaleno ");
			}
		 else if ((primeiroLado + segundoLado) > terceiroLado || (primeiroLado + terceiroLado) > segundoLado ||
					(segundoLado + terceiroLado) > primeiroLado)
				{
					System.out.println("Tri�ngulo is�sceles");
				}
		
		
		
		else {
				System.out.println();
		}
		 scan.close();
	}

}
