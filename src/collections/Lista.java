package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario user1 = new Usuario("Pedro");
        lista.add(user1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));  // acessa o item pelo índice

        lista.remove(1); // remove a partir do índice
        lista.remove(new Usuario("Manu")); // remove pelo objeto

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println("Tem? " + lista.contains(user1));

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
