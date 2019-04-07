package pacote;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
	System.out.println("Digite algum número: ");
	Scanner scan = new Scanner (System.in);
	int primeiroNumero = scan.nextInt();
	
	System.out.println("Digite algum outro número: ");
	int segundoNumero = scan.nextInt();
	
	System.out.println("Digite algum outro número: ");
	int terceiroNumero = scan.nextInt();
	
	if (primeiroNumero > segundoNumero)
	{
		if (primeiroNumero > terceiroNumero)
		{
			if(segundoNumero > terceiroNumero)
			{
				System.out.println(primeiroNumero);
				System.out.println(segundoNumero);
				System.out.println(terceiroNumero);
			}
			else
			{
				System.out.println(primeiroNumero);
				System.out.println(terceiroNumero);
				System.out.println(segundoNumero);
			}
			
		}
	}
		
	if (segundoNumero > primeiroNumero)
	{
		if (segundoNumero > terceiroNumero)
		{
			if(primeiroNumero > terceiroNumero)
			{
				System.out.println(segundoNumero);
				System.out.println(primeiroNumero);
				System.out.println(terceiroNumero);
			}
			else
			{
				System.out.println(segundoNumero);
				System.out.println(terceiroNumero);
				System.out.println(primeiroNumero);
			}
		}
	}
	if (terceiroNumero > primeiroNumero)
	{
		if (terceiroNumero > segundoNumero)
		{
			if(primeiroNumero > segundoNumero)
			{
				System.out.println(terceiroNumero);
				System.out.println(primeiroNumero);
				System.out.println(segundoNumero);
			}
			else
			{
				System.out.println(terceiroNumero);
				System.out.println(segundoNumero);
				System.out.println(primeiroNumero);
			}
			
		}
	}
	scan.close();
	}
	}
