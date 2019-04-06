package pacote;

import java.io.IOException; /* Importação usada para capturar a entrada de dados por caracteres*/

public class Exercicio03 {

	public static void main(String[] args) throws IOException {  /* Metodo da importação usada para capturar a entrada de dados por caracteres*/
		
		System.out.println("Insira seu sexo digitando M para masculino e F para feminino: ");
		
		char sexoDigitado = (char)System.in.read();
		
		if (sexoDigitado == 'M' )
		{
			System.out.println("Masculino");
		}
		else if (sexoDigitado == 'm' )
		{
			System.out.println("Masculino");
		}
		else if (sexoDigitado == 'F')
		{
			System.out.println("Feminino");
		}
		else if (sexoDigitado == 'f')
		{
			System.out.println("Feminino");
		}
		else
		{
			System.out.println("Sexo inválido");
		}
		
			
		}
	}
	
