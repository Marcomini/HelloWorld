package pacote;

import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {

System.out.println("Digite o primeiro n�mero: ");
Scanner scan = new Scanner (System.in);
int primeiroValorDigitado = scan.nextInt();		

System.out.println("Digite o segundo n�mero: ");
int segundoValorDigitado = scan.nextInt();

System.out.println("Digite o terceiro n�mero: ");
int terceiroValorDigitado = scan.nextInt();

	if  (primeiroValorDigitado > segundoValorDigitado)
		{
		if (primeiroValorDigitado > terceiroValorDigitado)
		{
			System.out.println(primeiroValorDigitado);
		}
		}
	if (segundoValorDigitado > primeiroValorDigitado)
		{
		if (segundoValorDigitado > terceiroValorDigitado)
		{
			System.out.println(segundoValorDigitado);
		}
		}
	if (terceiroValorDigitado > primeiroValorDigitado)
		{
		if (terceiroValorDigitado > segundoValorDigitado)
		{
			System.out.println(terceiroValorDigitado);
		}
		}
	scan.close();
		}
		}