package br.uninove.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

public static Connection receberConexao(){
	
	Connection con = null;
	try{
		
	
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_usuario","root","");
	System.out.println("Conectado com sucesso!");
	}
	catch (SQLException e)
	{
		e.printStackTrace();
		System.err.println("N�o foi possivel conectar");
	}
	return con;
}
	

}
