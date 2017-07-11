package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);
    
    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDescontoDe(0.1);
    }
    
}

// conveção de nomes Java http://www.oracle.com/technetwork/java/codeconventions-135099.html
