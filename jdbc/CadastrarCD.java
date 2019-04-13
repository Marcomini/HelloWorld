package br.uninove.jdbc;

import java.util.Scanner;

import br.uninove.jdbc.CD;
import br.uninove.jdbc.CDDao;

public class CadastrarCD {

public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);
CD cd = new CD();

System.out.println("**********CADASTRAR NOVO CD*************");
System.out.println("Gen�ro: ");
cd.setGenero(leitor.nextLine());
System.out.println("Ano de lan�amento: ");
cd.setAno(leitor.nextInt());
System.out.println("T�tulo: ");
cd.setTitulo(leitor.nextLine());

CDDao.cadastrar(cd);

leitor.close();
System.out.println("Cd cadastrado!");
}

}