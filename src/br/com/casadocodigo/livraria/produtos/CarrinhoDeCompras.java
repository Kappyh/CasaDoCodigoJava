package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;
    
    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public void getProdutos() {

        for (int i = 0; i < produtos.length; i++) {
            try {
                Produto produto = produtos[i];

                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("deu exception no indice" + i);
            } catch (NullPointerException e) {
                System.out.println("O Array não foi instanciado!");
            }
            System.out.println("Fui executado");
        }
    }

}
