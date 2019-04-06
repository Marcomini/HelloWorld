package pacote;

import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {

		System.out.println("Digite algum número aqui: ");
		Scanner scan = new Scanner(System.in);
		int ValorNegativoouPositivo = scan.nextInt();
	
		if( ValorNegativoouPositivo >= 0)
		{
			System.out.println("Positivo");
		}
		else
		{
			System.out.println("Negativo");
		}
		scan.close();
	}
	
	

}
