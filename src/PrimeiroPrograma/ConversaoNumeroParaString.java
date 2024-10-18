package PrimeiroPrograma;

public class ConversaoNumeroParaString {
    public static void main(String[] args) {
        // método toString() é usado para converter valores em strings.
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        /* também é possível:
        *  Long.toString();
        *  Short.toStrinf();
        */

    }
}
