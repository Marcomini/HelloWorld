package exerc�ciosSimples;

import java.util.Scanner;	

public class QuantoEuGanhoPorHora {

	public static void main(String[] args) {

	System.out.println("Quanto voc� ganha por hora? ");
	Scanner variaveldeApoio1 = new Scanner(System.in);
	float valorGanhoporHora = variaveldeApoio1.nextFloat();
	
	System.out.println("Quantas horas voc� trabalhou ou trabalha no m�s? ");
	Scanner variaveldeApoio2 = new Scanner(System.in);
	float horasTrabalhadas = variaveldeApoio2.nextFloat();
	
	float salario = valorGanhoporHora * horasTrabalhadas;
	
	System.out.println("O seu salario deve ser de igual a R$:" + salario + " por m�s");
	variaveldeApoio1.close();
	variaveldeApoio2.close();
	
	}

}
