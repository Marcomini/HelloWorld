package pacote;

import java.util.Scanner; //https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
public class Exercicio08 {

	public static void main(String[] args) {

		System.out.println("Digite o valor do primeiro produto R$: ");
		Scanner scan = new Scanner (System.in);
		float produto01 = scan.nextFloat();
		
		System.out.println("Digite o valor do segundo produto R$: ");
		float produto02 = scan.nextFloat();
		
		System.out.println("Digite o valor do terceiro produto R$: ");
		float produto03 = scan.nextFloat();
		
		if (produto01 < produto02 || produto01 < produto03)
		{
			System.out.println("O primeiro produto no valor R$:" +produto01 +" é mais barato");
		}
		else if (produto02 < produto01 || produto02 < produto03)
		{
			System.out.println("O segundo produto no valor R$:" +produto02 +" é mais barato");
		}
		else if (produto03 < produto01 || produto03 < produto02)
		{
			System.out.println("O terceiro no valor R$:" +produto03 +" é mais barato");
		}
		scan.close();
		
	}

}
