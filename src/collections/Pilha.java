package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        // Last in, First out -> LIFO
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno Príncipe"); // adiciona elementos na pilha, se não conseguir retorna NULL
        livros.push("Don Quixote"); // adiciona elementos na pilha, se não conseguir retorna uma exception
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // mesma função do metoodo na fila, porém seguindo a lógica do LIFO
        System.out.println(livros.element()); // mesma função do metoodo na fila, porém seguindo a lógica do LIFO

        System.out.println(livros.poll()); // mesma função do metoodo na fila, porém seguindo a lógica do LIFO
        System.out.println(livros.remove()); // mesma função do metoodo na fila, porém seguindo a lógica do LIFO
        System.out.println(livros.pop()); // remove um elemeento, se não conseguir retorna uma exceção.

        // todos métodos abaixo funcionam de forma semelhante à fila
        // livros.size();
        // livros.clear();
        //livros.contains();
        // livros.isEmpty();
    }
}
