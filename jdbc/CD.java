package br.uninove.jdbc;

public class CD {
	
	private int Codigo;
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	private String Genero;
	private int Ano;
	private String Titulo;
	private String Artista;
	public static void add(CD cd) {
		
	}
}