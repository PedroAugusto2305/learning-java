package PrimeiroPrograma.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b;
        c -= b; // c = c - b;
        c *= b; // c = c * b;
        c /= b; // c = c / b;
        c %= 2; // c = c % 2;
        System.out.println(c);
    }
}
