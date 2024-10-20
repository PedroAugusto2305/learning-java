package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        System.out.println("Informe o Raio do Quadrado: ");
        double raio = sc.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A área do quadrado é: %.2f", area);

        sc.close();
    }
}
