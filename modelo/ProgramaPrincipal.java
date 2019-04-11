package br.uninove.programa;

import java.util.Scanner;

import br.uninove.modelo.Usuario;
import br.uninove.modelo.UsuarioDao;

public class ProgramaPrincipal {

public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);
Usuario usuario = new Usuario();

System.out.println("**********CADASTRAR USUARIO*************");
System.out.println("Nome: ");
usuario.setNome(leitor.nextLine());
System.out.println("Login: ");
usuario.setLogin(leitor.nextLine());
System.out.println("Senha: ");
usuario.setSenha(leitor.nextLine());

UsuarioDao.cadastrar(usuario);

leitor.close();
System.out.println("Usuario cadastrado!");
}

}
