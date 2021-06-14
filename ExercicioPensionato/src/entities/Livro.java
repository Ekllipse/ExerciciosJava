package entities;

public class Livro {
	
	private String nomeLivro;
	private String autor;
	
	public Livro(String nomeLivro) {

		this.nomeLivro = nomeLivro;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	

}
