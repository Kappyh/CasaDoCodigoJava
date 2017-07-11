package br.com.casadocodigo.livraria.exception;

public class AutorNuloException extends RuntimeException {

    public AutorNuloException() {
    }

    public AutorNuloException(String mensagem) {
        super(mensagem);
    }
}
