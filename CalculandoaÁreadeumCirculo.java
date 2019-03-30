package exercíciosSimples;

import java.util.Scanner;

public class CalculandoaÁreadeumCirculo {

	public static void main(String[] args) {
		System.out.println("Insira o valor do raio");
		Scanner variaveldeApoio = new Scanner(System.in);
		float valordoRaio = variaveldeApoio.nextFloat();
		
		float valorArea = (float) (Math.PI * (valordoRaio * valordoRaio));
		System.out.println("O valor da área é:" + valorArea);
		variaveldeApoio.close();
		
	}

}
