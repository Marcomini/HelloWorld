package exercíciosSimples;

import java.util.Scanner;

public class ConversordeMetrosParaCentimetros {

	public static void main(String[] args) {

		System.out.println("Digite o valor em metros: ");
		Scanner variaveldeApoio00 =  new Scanner(System.in);
		float valoremMetros = variaveldeApoio00.nextFloat();
		
		float cm = valoremMetros*100;
		System.out.println("O valor em centimetros é " + cm + " cm");
		variaveldeApoio00.close();
		
	}

}
