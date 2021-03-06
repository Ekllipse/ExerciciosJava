package entities;

public class Estudantes {
	
	
	private String nome;
	private String email;
	private int quarto;
	private String telefone;
	
	private Livro [] livros = new Livro[2];
	
	


	public Estudantes(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	

	public Estudantes(String nome, String email, int quarto, String telefone) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
		this.telefone = telefone;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public Livro[] getLivros() {
		return livros;
	}



	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	
	

}
