package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import br.uninove.jdbc.Conexao;
public class BuscaUsuarioPorCodigo{
	public static void main(String[] args) {
		
		Connection con = Conexao.receberConexao();
		Usuario usuario = null;
		String sql =  "SELECT * from usuario where codigo = 1";
		
		try {
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement (sql);
			ResultSet resultado = preparador.executeQuery();
			
			if (resultado.next()){
				usuario = new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("Senha"));
				}
			System.out.println("Codigo: " + usuario.getCodigo());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
		}
				catch (SQLException e){
					e.printStackTrace();
				
		}
	}
}
