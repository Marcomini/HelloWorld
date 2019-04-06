package pacote;

import java.io.IOException;
public class Exercicio04 {

public static void main(String[] args) throws IOException {
	
	System.out.println("Digite alguma letra: ");
	char letraDigitada = (char)System.in.read(); 
	
	switch (letraDigitada)
	{
	case 'a':System.out.println("Vogal");break;
	case 'A':System.out.println("Vogal");break;
	case 'e':System.out.println("Vogal");break;
	case 'E':System.out.println("Vogal");break;
	case 'i':System.out.println("Vogal");break;
	case 'I':System.out.println("Vogal");break;
	case 'o':System.out.println("Vogal");break;
	case 'O':System.out.println("Vogal");break;
	case 'u':System.out.println("Vogal");break;
	case 'U':System.out.println("Vogal");break;
	default: System.out.println("Consoante");break;
	}
	}


}
