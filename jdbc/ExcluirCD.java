package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class ExcluirCD {

	public static void main(String[] args) {
		Connection con = Conexao.receberConexao();
		String sql = "DELETE from tabela_cd where codigo = 2";
		
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
