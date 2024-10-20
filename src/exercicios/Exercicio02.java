package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de um dos lados do quadro: ");
        double lado = sc.nextDouble();

        double resultado = (lado * lado) * 2;

        System.out.printf("O valor do dobro da área do quadrado é: %.2f", resultado);

        sc.close();
    }
}
