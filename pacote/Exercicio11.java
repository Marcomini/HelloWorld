package pacote;
	
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {

		System.out.println("Digite aqui o valor do sálario: ");
		Scanner scan = new Scanner (System.in);
		 double salario = scan.nextDouble();
	
		 if(salario < 280)
		 {
			 double salariocomReajuste = (salario * 0.20) + salario;
			 System.out.println("Sálario antes R$:" + salario);
			 System.out.println("Sálario agora R$:" + salariocomReajuste);
			 double valordoAumento = (salario * 0.20);
			 System.out.println("Valor do aumento R$:" + valordoAumento);
			 System.out.println("Percentual de aumento: 20%");
		 }
		 if(salario >= 280 && salario <= 700)
		 {
			 double salariocomReajuste = (salario * 0.15) + salario;
			 System.out.println("Sálario antes R$:" + salario);
			 System.out.println("Sálario agora R$:" + salariocomReajuste);	
			 double valordoAumento = (salario * 0.15);
			 System.out.println("Valor do aumento R$:" + valordoAumento);
			 System.out.println("Percentual de aumento: 15%");
		 }
		 if(salario > 700 && salario < 1500)
		{
			 double salariocomReajuste = (salario * 0.10) + salario;
			 System.out.println("Sálario antes R$:" + salario);
			 System.out.println("Sálario agora R$:" + salariocomReajuste);
			 double valordoAumento = (salario * 0.10);
			 System.out.println("Valor do aumento R$:" + valordoAumento);
			 System.out.println("Percentual de aumento: 10%");
		}
		 if (salario >= 1500)
		 {
			 double salariocomReajuste = (salario * 0.05) + salario;
			 System.out.println("Sálario antes R$:" + salario);
			 System.out.println("Sálario agora R$:" + salariocomReajuste);
			 double valordoAumento = (salario * 0.05);
			 System.out.println("Valor do aumento R$:" + valordoAumento);
			 System.out.println("Percentual de aumento: 5%");
		 }
		 scan.close();
		}
	}