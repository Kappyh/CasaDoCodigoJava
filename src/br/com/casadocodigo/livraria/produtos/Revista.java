package br.com.casadocodigo.livraria.produtos;

import livraria.Editora;

public class Revista implements Produto {

    private String nome;
    private String descrição;
    private double valor;
    private Editora editora;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getValor() {
        return valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

}
