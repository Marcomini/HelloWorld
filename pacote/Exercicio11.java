package pacote;
	
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {

		System.out.println("Digite aqui o valor do sálario: ");
		Scanner scan = new Scanner (System.in);
		 int salario = scan.nextInt();
		
		if (salario <= 280)
		{
			salario = (int) (salario*0.20);
			System.out.println("Você terá um aumento de R$:" + salario);
			int salario1 = (int) ((salario * 0.20) + salario);
			System.out.println("Você teve um aumento de 20% no seu sálario");
			System.out.println("Seu sálario com o ajuste é de R$:" + salario1);
			System.out.println("Seu sálario anterior era de R$:" + salario);
		}
		if (salario <= 700 && salario > 280)
		{
			salario = (int) (salario*0.15);
			System.out.println("Você terá um aumento de R$:" + salario);
			int salario2 = (int) ((salario * 0.15) + salario);
			System.out.println("Você teve um aumento de 15% no seu sálario");
			System.out.println("Seu sálario com o ajuste é de R$:" + salario2);
			System.out.println("Seu sálario anterior era de R$:" + salario);
		}
		if (salario <= 1500 && salario > 700)
		{
			salario = (int) (salario*0.10);
			System.out.println("Você terá um aumento de R$:" + salario);
			int salario3 = (int) ((salario * 0.10) + salario);
			System.out.println("Você teve um aumento de 10% no seu sálario");
			System.out.println("Seu sálario com o ajuste é de R$:" + salario3);
			System.out.println("Seu sálario anterior era de R$:" + salario);
		}
		if (salario > 1500)
		{
			salario = (int) (salario*0.05);
			System.out.println("Você terá um aumento de R$:" + salario);
			int salario4 = (int) ((salario * 0.5) + salario);
			System.out.println("Você teve um aumento de 5% no seu sálario");
			System.out.println("Seu sálario com o ajuste é de R$:" + salario4);
			System.out.println("Seu sálario anterior era de R$:" + salario);
		}
		}
}
