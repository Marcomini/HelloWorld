package exercÌciosSimples;
import java.util.Scanner;

public class Calculandoa¡readeumQuadradoeRetornandooDobrodoValorda¡rea {

	public static void main(String[] args) {

		System.out.println("Digite a ·rea do quadrado: ");
		Scanner variaveldeApoio = new Scanner(System.in);
		float areadoQuadrado = variaveldeApoio.nextFloat();
		
		float resultado = (areadoQuadrado*areadoQuadrado);
		float resultadoemDobro = resultado * 2;
		System.out.println("·rea do quadrado em dobro È igual a: " + resultadoemDobro);
		variaveldeApoio.close();
	}
}

