package exercíciosSimples;

import java.util.Scanner;

public class MeMostreONúmeroQueDigitei {

	public static void main(String[] args) {
		
		System.out.println("Digite algum número: ");
		Scanner variaveldeApoio = new Scanner(System.in);		
		int numeroDigitadoPeloUsuario = variaveldeApoio.nextInt();
		System.out.println("Você digitou o número: " + numeroDigitadoPeloUsuario);
		variaveldeApoio.close();
	}
}
