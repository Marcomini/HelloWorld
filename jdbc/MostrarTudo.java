package br.modelo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Remover {

	public static void removendo(int codigo) {
		Connection con = Conexao.receberConexao();
		String sql = "DELETE from tabelacd where codigo = ?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1,codigo);
			
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
