package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CDDao {
public static void cadastrar(CD usu){
Connection con = Conexao.receberConexao();
String sql = "INSERT INTO usuario(genero, ano, titulo,artista) VALUES(?, ?, ?, ?)";
try {
PreparedStatement preparador = con.prepareStatement(sql);

preparador.setString(1, usu.getGenero());
preparador.setInt(2, usu.getAno());
preparador.setString(3, usu.getTitulo());
preparador.setString(4, usu.getArtista());

preparador.execute();
preparador.close();
System.out.println("Cd adicionado ao banco!");
} catch (SQLException e) {
e.printStackTrace();
System.err.println("Não foi possivel adicionar...");
}
}}