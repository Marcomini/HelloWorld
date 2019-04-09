package br.uninove.jdbc;
import java.sql.PreparedStatement;
import java.sql.Connection;

import java.sql.SQLException;
public class Usuario {
	
	private int Codigo;
	private String Nome;
	private String Login;
	private String Senha;
	
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


	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setLogin("PJ");
		usuario.setSenha("123");
		
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