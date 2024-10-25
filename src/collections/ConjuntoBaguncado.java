package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({ "rawtypes", "unchecked" }) // só pra retirar os warners
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // adiciona elementos
        conjunto.add(1.2); // double -> Double;
        conjunto.add(true);
        conjunto.add("Texto");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size()); // 5 elementos
        conjunto.add("Texto");
        System.out.println(conjunto.size()); // 5 elementos, não reconhece elemento duplicado

        // remove elementos
        conjunto.remove("Texto");
        System.out.println(conjunto.size()); // 4 elementos
        System.out.println(conjunto.contains('x')); // true

        // também é válido
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // união entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); // intersecção entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); // limpa o conjunto
        System.out.println(conjunto);
    }
}
