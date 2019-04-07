package pacote;

import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args){

	System.out.println("Digite o primeiro número: ");
	Scanner scan = new Scanner(System.in);
	int primeiroValorDigitado = scan.nextInt();
	
	System.out.println("Digite o segundo número: ");
	int segundoValorDigitado = scan.nextInt();
	
	System.out.println("Digite o terceiro número: ");
	int terceiroValorDigitado = scan.nextInt();
	
	if (primeiroValorDigitado > segundoValorDigitado)
	{
		if (primeiroValorDigitado > terceiroValorDigitado)
		{
			if(segundoValorDigitado < terceiroValorDigitado)
			{
				System.out.println("O " +primeiroValorDigitado +" é o maior número, enquanto o " + segundoValorDigitado + " é o menor");
			}
				else
				{
					System.out.println("O " +primeiroValorDigitado +" é o maior número, enquanto o " + terceiroValorDigitado + " é o menor");

				}
			}
		}
	if (segundoValorDigitado > primeiroValorDigitado)
	{
		if (segundoValorDigitado > terceiroValorDigitado)
		{
			if(primeiroValorDigitado < terceiroValorDigitado)
			{
				System.out.println("O " +segundoValorDigitado +" é o maior número, enquanto o " + primeiroValorDigitado + " é o menor");
			}
				else
				{
					System.out.println("O " +segundoValorDigitado +" é o maior número, enquanto o " + terceiroValorDigitado + " é o menor");

				}
			}
		}
	if (terceiroValorDigitado > primeiroValorDigitado)
	{
		if (terceiroValorDigitado > segundoValorDigitado)
		{
			if(primeiroValorDigitado < segundoValorDigitado)
			{
				System.out.println("O " +terceiroValorDigitado +" é o maior número, enquanto o " + primeiroValorDigitado + " é o menor");
			}
				else
				{
					System.out.println("O " +terceiroValorDigitado +" é o maior número, enquanto o " + segundoValorDigitado + " é o menor");

				}
			}
		}
	scan.close();
}
}