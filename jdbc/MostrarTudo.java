package br.modelo.jdbc;
	 
	 import java.sql.Connection; 
	 import java.sql.ResultSet; 
	 import java.sql.SQLException; 
	 import java.util.ArrayList; 
	 
	 public class MostrarTudo {

	 
	
		public static void main(String[] args) { 
	 		ArrayList<Cd> variavel1 = new ArrayList<Cd>(); 
	 		 Connection con = Conexao.receberConexao(); 
			String sql = "SELECT * FROM usuario"; 
	 		try { 
	 		java.sql.PreparedStatement preparador = con.prepareStatement(sql); 
			ResultSet resultado = preparador.executeQuery(); 
	 		 
	 		while (resultado.next()){ 
	 			 
	 			Cd cd = new Cd(); 
	 			cd.setCodigo(resultado.getInt("codigo:")); 
	 			cd.setNomedoCd(resultado.getString("Disco:")); 
	 			cd.setGenero(resultado.getString("Genêro:")); 
	 			cd.setArtista(resultado.getString("Artista:")); 
	 			
	 			 
	 			variavel1.add(cd); 
			} 
	 		for(Cd variavel2:variavel1){ 
	 		 
	 		System.out.println("Código:" + variavel2.getCodigo()); 
	 		System.out.println("Disco:" + variavel2.getNomedoCd()); 
	 		System.out.println("Genêro:" + variavel2.getGenero()); 
			System.out.println("Artista:" + variavel2.getArtista()); 
			} 
			} 
			catch (SQLException e) 
		{  
	 			e.printStackTrace(); 
	 		}	 
	 	} 
	 } 


