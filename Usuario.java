package br.uninove.jdbc;
import java.sql.PreparedStatement;
import java.sql.Connection;

import java.sql.SQLException;
public class Usuario {
	int Codigo;
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	String Nome;
	String Login;
	String Senha;

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setNome("Joselito");
		usuario.setLogin("renato");
		usuario.setSenha("12345");
		
		Connection con = Conexao.receberConexao();
		
		String sql = "INSERT INTO usuario(nome,login,senha) VALUES(?,?,?)";
		
		try {
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Usuario conectado!");
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Não foi possivel conectar");
		}
		
				
		
		
		
	}

}
