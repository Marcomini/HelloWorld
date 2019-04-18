package br.modelo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Remover {

	public static void main(String[] args) {
		Connection con = Conexao.receberConexao();
		String sql = "DELETE from tabelacd where codigo = 0";

		try {
			PreparedStatement preparador = (PreparedStatement) con
					.prepareStatement(sql);
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
