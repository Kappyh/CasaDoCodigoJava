package livraria;

public class Ebook extends Livro {
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		} else {
			double desconto = getValor() * porcentagem;
			setValor(getValor() - desconto);
			System.out.println("Aplicado desconto no ebook");
			return true;
		}
	}
}
