package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MostrarTodos {
	
	public static void main(String[] args) {
		ArrayList<CD> cds = new ArrayList<CD>();
		 Connection con = Conexao.receberConexao();
		String sql = "SELECT * FROM tabela_cd";
		try {
		java.sql.PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet resultado = preparador.executeQuery();
		
		while (resultado.next()){
			
			CD cd = new CD();
			cd.setCodigo(resultado.getInt("codigo: "));
			cd.setGenero(resultado.getString("Gênero: "));
			cd.setAno(resultado.getInt("Ano: "));
			cd.setTitulo(resultado.getString("Titulo:"));
			cd.setArtista(resultado.getString("Artista(s):"));

			
			CD.add(cd);

		}
		for(CD t:cds){
		
		System.out.println("Código: " + t.getCodigo());
		System.out.println("Gênero: " + t.getGenero());
		System.out.println("Ano: " + t.getAno());
		System.out.println("Título: " + t.getTitulo());
		System.out.println("Artista(s):" + t.getArtista());
		}
		}
		catch (SQLException e)
		{ 
			e.printStackTrace();
			System.err.println("Erro tente novamente!");

		}	
	}
}