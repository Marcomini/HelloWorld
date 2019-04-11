package br.uninove.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {
public static void cadastrar(Usuario usu){
Connection con = Conexao.receberConexao();
String sql = "INSERT INTO usuario(nome, login, senha) VALUES(?, ?, ?)";
try {
PreparedStatement preparador = con.prepareStatement(sql);
preparador.setString(1, usu.getNome());
preparador.setString(2, usu.getLogin());
preparador.setString(3, usu.getSenha());
preparador.execute();
preparador.close();
System.out.println("Adicionado com Sucesso!");
} catch (SQLException e) {
e.printStackTrace();
System.err.println("Não Foi Possivel Adicionar...");
}
}}