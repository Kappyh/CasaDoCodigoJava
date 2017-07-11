package br.com.casadocodigo.livraria.produtos;

import livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressão() {
		return this.getValor() * 0.05;
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicado desconto no livro físico");
		return true;
	}
}
