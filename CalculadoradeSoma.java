package exercíciosSimples;
import java.util.Scanner;

public class CalculadoradeSoma {

	public static void main(String[] args) {
		
			System.out.println("Calculadora de soma");
			Scanner variaveldeApoio1 = new Scanner(System.in);
			System.out.println("Digite o primeiro valor para a soma:");
			int PrimeiroValor = variaveldeApoio1.nextInt();
		
			Scanner variaveldeApoio2 = new Scanner(System.in);
			System.out.println("Digite o segundo valor para a soma:");
			int SegundoValor = variaveldeApoio2.nextInt();	
		
		int resultado = PrimeiroValor + SegundoValor;
		System.out.println("O resulta da soma foi:" + resultado);
		variaveldeApoio1.close();
		variaveldeApoio2.close();


	}
		
	}

