package pacote;

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {

		System.out.println("Digite o primeiro n�mero: ");
		Scanner scan = new Scanner (System.in);
		int primeiroValorDigitado = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int segundoValorDigitado = scan.nextInt();
		
		System.out.println("Digite o terceiro n�emro: ");
		int terceiroValorDigitado = scan.nextInt();
		
		if  (primeiroValorDigitado > segundoValorDigitado || primeiroValorDigitado > terceiroValorDigitado)
		{
			System.out.println(primeiroValorDigitado);
		}
		
		else if (segundoValorDigitado > primeiroValorDigitado || segundoValorDigitado > terceiroValorDigitado)
		{
			System.out.println(segundoValorDigitado);
		}
		else if (terceiroValorDigitado > primeiroValorDigitado || terceiroValorDigitado > segundoValorDigitado)
		{
			System.out.println(terceiroValorDigitado);
		}
		scan.close();
		}
	}


