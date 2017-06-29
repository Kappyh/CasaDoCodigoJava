package livraria;

public class LivroFisico extends Livro {
	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressão() {
		return this.getValor() * 0.05;
	}
}
