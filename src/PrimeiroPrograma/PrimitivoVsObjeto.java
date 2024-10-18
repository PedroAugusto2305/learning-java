package PrimeiroPrograma;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        // objetos têm a notação ponto.
        String s = "texto";
        s = s.toUpperCase();
        System.out.println(s);

        // tipos primitivos não tem notação ponto.
        int a = 123;
        System.out.println(a);

        // tudo em java é objeto, menos os 8 tipos primitivos.
    }
}
