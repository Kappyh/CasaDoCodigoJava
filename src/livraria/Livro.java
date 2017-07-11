package livraria;

public abstract class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	// Composição
	private Autor autor;

	// Construtor
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-0000-00-0";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	// funções inclusas para acesso a variável valor
	void setValor(double valor) {
		this.valor = valor;
	}

	double getValor() {
		return this.valor;
	}

	void mostrarDetalhes() {
		String mensagem = "Monstrando os detalhes do livro";

		System.out.println(mensagem);
		System.out.println("Nome: " + getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("ISBN: " + getIsbn());

		if (temAutor()) {
			// Esse comportamente pertence a classe autor
			autor.mostrarDetalhes();
		} else {
			System.out.println("--");
		}
		System.out.println("-----");
	}

	boolean temAutor() {
		return this.autor != null;
	}

	public abstract boolean aplicaDescontoDe(double porcentagem);

}
