package pacote;

import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args){

	System.out.println("Digite o primeiro n�mero: ");
	Scanner scan = new Scanner(System.in);
	int primeiroValorDigitado = scan.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	int segundoValorDigitado = scan.nextInt();
	
	System.out.println("Digite o terceiro n�mero: ");
	int terceiroValorDigitado = scan.nextInt();
	
	if (primeiroValorDigitado > segundoValorDigitado)
	{
		if (primeiroValorDigitado > terceiroValorDigitado)
		{
			if(segundoValorDigitado < terceiroValorDigitado)
			{
				System.out.println("O " +primeiroValorDigitado +" � o maior n�mero, enquanto o " + segundoValorDigitado + " � o menor");
			}
				else
				{
					System.out.println("O " +primeiroValorDigitado +" � o maior n�mero, enquanto o " + terceiroValorDigitado + " � o menor");

				}
			}
		}
	if (segundoValorDigitado > primeiroValorDigitado)
	{
		if (segundoValorDigitado > terceiroValorDigitado)
		{
			if(primeiroValorDigitado < terceiroValorDigitado)
			{
				System.out.println("O " +segundoValorDigitado +" � o maior n�mero, enquanto o " + primeiroValorDigitado + " � o menor");
			}
				else
				{
					System.out.println("O " +segundoValorDigitado +" � o maior n�mero, enquanto o " + terceiroValorDigitado + " � o menor");

				}
			}
		}
	if (terceiroValorDigitado > primeiroValorDigitado)
	{
		if (terceiroValorDigitado > segundoValorDigitado)
		{
			if(primeiroValorDigitado < segundoValorDigitado)
			{
				System.out.println("O " +terceiroValorDigitado +" � o maior n�mero, enquanto o " + primeiroValorDigitado + " � o menor");
			}
				else
				{
					System.out.println("O " +terceiroValorDigitado +" � o maior n�mero, enquanto o " + segundoValorDigitado + " � o menor");

				}
			}
		}
	scan.close();
}
}