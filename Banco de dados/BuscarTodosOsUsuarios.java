package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BuscarTodosOsUsuarios {
	
	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		 Connection con = Conexao.receberConexao();
		String sql = "SELECT * FROM usuario";
		try {
		java.sql.PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet resultado = preparador.executeQuery();
		
		while (resultado.next()){
			
			Usuario usuario = new Usuario();
			usuario.setCodigo(resultado.getInt("codigo"));
			usuario.setNome(resultado.getString("Nome"));
			usuario.setLogin(resultado.getString("Login"));
			usuario.setSenha(resultado.getString("Senha"));
			
			usuarios.add(usuario);
		}
		for(Usuario usu:usuarios){
		
		System.out.println("Código:" + usu.getCodigo());
		System.out.println("Nome:" + usu.getNome());
		System.out.println("Login:" + usu.getLogin());
		System.out.println("Senha:" + usu.getSenha());
		}
		}
		catch (SQLException e)
		{ 
			e.printStackTrace();
		}	
	}
}