package br.com.casadocodigo.livraria.produtos;

import livraria.Autor;

public class MiniLivro extends Livro {

	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}
