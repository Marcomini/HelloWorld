package pacote;
	
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		System.out.println("Digite algum n�mero: ");
		Scanner scan = new Scanner(System.in);
		int primeiroValorDigitado = scan.nextInt();
		
		System.out.println("Digite algum outro n�mero: ");
		int segundoValorDigitado = scan.nextInt();
		
		if ( primeiroValorDigitado > segundoValorDigitado)
		{
			System.out.println("Entre os dois n�meros que voc� digitou " + primeiroValorDigitado + " foi o maior");
		}
		else {
			System.out.println("Entre os dois n�meros que voc� digitou " + segundoValorDigitado + " foi o maior");
		}
		scan.close();
		}
	}
	


