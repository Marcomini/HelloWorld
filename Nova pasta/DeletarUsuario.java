package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DeletarUsuario {

	public static void main(String[] args) {
		Connection con = Conexao.receberConexao();
		String sql = "DELETE from usuario where codigo = 5";
		
		try
		{
			PreparedStatement preparador = (PreparedStatement) con.prepareStatement(sql);
			preparador.execute();
			preparador.close();
			System.out.println("Excluido");
		}
			
		catch
	
		 (SQLException e) {
			e.printStackTrace();
			System.err.println("Erro ao excluir");
				
		}
	}
	}

