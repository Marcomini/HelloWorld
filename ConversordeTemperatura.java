package exercíciosSimples;

import java.util.Scanner;

public class ConversordeTemperatura {

	public static void main(String[] args) {

		System.out.println("Digite o valor em farenheit: ");
		Scanner variaveldeApoio = new Scanner(System.in);
		int valorDigitadoEmFarenheit = variaveldeApoio.nextInt();
		
		int celsius = 5* ( valorDigitadoEmFarenheit - 32)/9;
		System.out.println("A temperatura é de " + celsius + "°C");
		variaveldeApoio.close();
	
	}

}
