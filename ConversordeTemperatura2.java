package exercíciosSimples;

import java.util.Scanner;

public class ConversordeTemperatura2 {

	public static void main(String[] args) {
		System.out.println("Digite o valor em Celsius: ");
		Scanner variaveldeApoio = new Scanner(System.in);
		int valoremCelsius = variaveldeApoio.nextInt();
		
		int valoremFahrenheit = (valoremCelsius * 9/5) + 32; 
		System.out.println("A temperatura é de " + valoremFahrenheit + "°F");
		variaveldeApoio.close();
	}

}
