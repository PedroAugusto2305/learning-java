package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        // First in, First out -> FIFO
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia"); // retorna falso caso não consiga inserir um elemento na fila
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // mostra o primeiro elemento da fila, se a fila estiver vazia retorna NULL
        System.out.println(fila.element()); // mostra o primeiro elemento da fila, se a fila estiver vazia retorna uma exception

        // fila.size(); verifica tamanho da fila
        // fila.clear(); limpa a fila
        // fila.isEmpty(); verifica se a fila está vazia
        // fila.contains(); verifica se um elemento especifico está na fila

        System.out.println(fila.poll()); // remove elemento da fila, se a fila estiver vazia retorna NULL
        System.out.println(fila.remove()); // remove elemento da fila, se a fila estiver vazia retorna uma exception


    }
}
