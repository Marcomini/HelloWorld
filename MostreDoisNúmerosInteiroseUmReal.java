package exerc�ciosSimples;

import java.util.Scanner;

public class MostreDoisN�merosInteiroseUmReal {

	public static void main(String[] args) {

		System.out.println("Digite algum n�mero inteiro: ");
		Scanner variaveldeApoio1 = new Scanner(System.in);
		int primeiroNumeroInteiro = variaveldeApoio1.nextInt();
		
		System.out.println("Digite algum n�mero inteiro novamente :");
		Scanner variaveldeApoio2 = new Scanner(System.in);
		int segundoNumeroInteiro = variaveldeApoio2.nextInt();
		
		System.out.println("Digite algum n�mero real: ");
		Scanner variaveldeApoio3 = new Scanner(System.in);
		float primeiroNumeroReal = variaveldeApoio3.nextFloat();
		
		int dobro = primeiroNumeroInteiro * 2;
		int metade = segundoNumeroInteiro / 2;
		float somadoTriplo = (primeiroNumeroInteiro * 3) + primeiroNumeroReal;
		float elevadoaoCubo = (primeiroNumeroReal*primeiroNumeroReal*primeiroNumeroReal);
		System.out.println("O dobro do primeiro n�mero �: " + dobro);
		System.out.println("A metade do segundo n�mero �: " + metade);
		System.out.println("A soma do triplo do primeiro com o terceiro n�mero �: " + somadoTriplo);
		System.out.println("O terceiro n�mero elevado ao cubo �: " + elevadoaoCubo);
		variaveldeApoio1.close();
		variaveldeApoio2.close();
		variaveldeApoio3.close();
		
		
		
	}

}
