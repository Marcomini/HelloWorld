package br.modelo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CdDao {
	public static void cadastrar(Cd VariaveldeApoio) {
		Connection con = Conexao.receberConexao();
		String sql = "INSERT INTO tabelacd (nomedocd, genero, artista) VALUES(?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, VariaveldeApoio.getNomedocd());
			preparador.setString(2, VariaveldeApoio.getGenero());
			preparador.setString(3, VariaveldeApoio.getArtista());

			preparador.execute();
			preparador.close();
			System.out.println("Adicionado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Não Foi Possivel Adicionar...");
		}
	}
}
