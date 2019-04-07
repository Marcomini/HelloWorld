package pacote;

import java.io.IOException;
public class Exercicio10 {

	public static void main(String[] args) throws IOException {

		System.out.println("Digite com aqui em qual turno você estuda:");
		System.out.println("Sendo M para matutino, V para vespertino ou N para noturno");
		System.out.println("==========================================================");
		
		char periodo = (char)System.in.read();
		
		if (periodo == 'M')
		{
			System.out.println("Bom dia");
		}
		else if (periodo == 'm')
		{
			System.out.println("Bom dia");
		}
		if (periodo == 'V')
		{
			System.out.println("Boa tarde");
		}
		else if (periodo == 'v')
		{
			System.out.println("Boa tarde");
		}
		if (periodo == 'N')
		{
			System.out.println("Boa noite");
		}
		else if (periodo == 'n')
		{
			System.out.println("Boa noite");
		}
		else
		{
			System.out.println("Valor inválido");
		}
	}

}
