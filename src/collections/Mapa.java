package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // adiciona um elemento ao map, se não existir ele adiciona, se já existir ele substitui
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // pega as chaves
        System.out.println(usuarios.values()); // pega os valores
        System.out.println(usuarios.entrySet()); // pega chaves e valores

        System.out.println(usuarios.containsKey(3)); // verifica se contem essa chave
        System.out.println(usuarios.containsValue("Rebeca")); // verifica se contém esse valor

        System.out.println(usuarios.get(3)); // retorna o elemento
        System.out.println(usuarios.remove(4, "Rebeca")); // remove o elemento indicado

        // percorre as keys
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // percorre os values
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        // percorre ambos key e value
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
