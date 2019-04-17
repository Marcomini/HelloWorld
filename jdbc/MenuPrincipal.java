package br.modelo.jdbc;
import java.util.Scanner; 
	 
	 public class MenuPrincipal { 
	 
	 public static void main(String[] args) { 
	 
	 Scanner leitor = new Scanner(System.in); 
	 Cd cd = new Cd(); 
	 
	 System.out.println("**********CADASTRAR CD*************"); 
	 System.out.println("Disco: "); 
	 cd.setNomedoCd(leitor.nextLine()); 
	 System.out.println("Gênero: "); 
	 cd.setGenero(leitor.nextLine()); 
	 System.out.println("Artista: "); 
	 cd.setArtista(leitor.nextLine()); 
	 
	 
	 CdDao.cadastrar(cd); 
	 
	 leitor.close(); 
	 System.out.println("Cd cadastrado!"); 
	 } 
	 
	 
	} 

	