package exercíciosSimples;

import java.util.Scanner;

public class MostreDoisNúmerosInteiroseUmReal {

	public static void main(String[] args) {

		System.out.println("Digite algum número inteiro: ");
		Scanner variaveldeApoio1 = new Scanner(System.in);
		int primeiroNumeroInteiro = variaveldeApoio1.nextInt();
		
		System.out.println("Digite algum número inteiro novamente :");
		Scanner variaveldeApoio2 = new Scanner(System.in);
		int segundoNumeroInteiro = variaveldeApoio2.nextInt();
		
		System.out.println("Digite algum número real: ");
		Scanner variaveldeApoio3 = new Scanner(System.in);
		float primeiroNumeroReal = variaveldeApoio3.nextFloat();
		
		int dobro = primeiroNumeroInteiro * 2;
		int metade = segundoNumeroInteiro / 2;
		float somadoTriplo = (primeiroNumeroInteiro * 3) + primeiroNumeroReal;
		float elevadoaoCubo = (primeiroNumeroReal*primeiroNumeroReal*primeiroNumeroReal);
		System.out.println("O dobro do primeiro número é: " + dobro);
		System.out.println("A metade do segundo número é: " + metade);
		System.out.println("A soma do triplo do primeiro com o terceiro número é: " + somadoTriplo);
		System.out.println("O terceiro número elevado ao cubo é: " + elevadoaoCubo);
		variaveldeApoio1.close();
		variaveldeApoio2.close();
		variaveldeApoio3.close();
		
		
		
	}

}
