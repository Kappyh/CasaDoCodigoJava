package br.com.casadocodigo.livraria.produtos;

import livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    // Composição
    private Autor autor;

    // Construtor
    public Livro(Autor autor) {
        
        if(autor == null){
            throw new AutorNuloException("O autor não pode ser nulo");
        }
        
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
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    public void mostrarDetalhes() {
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
    
    @Override
    public String toString() {
        return "Nome: " + nome
                +"\nDescrição: "+ descricao
                +"\nValor: "+ valor
                +"\nISBN: "+ isbn;   
    }
    
//    @Override
//    public boolean equals(Object obj){
//        if(!(obj instanceOf Autor)) return false;
//    
//        Autor outro = (Autor) obj;
//        return this.nome.equals(outro.nome);
//    }

    public abstract boolean aplicaDescontoDe(double porcentagem);

}
