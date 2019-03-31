package exercíciosSimples;

import java.util.Scanner;	

public class QuantoEuGanhoPorHora {

	public static void main(String[] args) {

	System.out.println("Quanto você ganha por hora? ");
	Scanner variaveldeApoio1 = new Scanner(System.in);
	float valorGanhoporHora = variaveldeApoio1.nextFloat();
	
	System.out.println("Quantas horas você trabalhou ou trabalha no mês? ");
	Scanner variaveldeApoio2 = new Scanner(System.in);
	float horasTrabalhadas = variaveldeApoio2.nextFloat();
	
	float salario = valorGanhoporHora * horasTrabalhadas;
	
	System.out.println("O seu salario deve ser de igual a R$:" + salario + " por mês");
	variaveldeApoio1.close();
	variaveldeApoio2.close();
	
	}

}
