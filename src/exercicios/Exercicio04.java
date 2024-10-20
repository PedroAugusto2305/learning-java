package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro:");
        int num1 = sc.nextInt();

        System.out.println("Informe o segundo número inteiro:");
        int num2 = sc.nextInt();

        System.out.println("Informe um número real");
        double num3 = sc.nextDouble();

        int primeiroComSegundo = (int) (num1 * 2) * (num2 / 2);

        double primeiroComTerceiro = (num1 * 3) + num3;

        double terceiroAoCubo = Math.pow(num3, 3);

        System.out.printf("O produto do dobro do primeiro com metade do segundo é: %d\n", primeiroComSegundo);
        System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f\n", primeiroComTerceiro);
        System.out.printf("O terceiro elevado ao cubo é: %.2f", terceiroAoCubo);
    }
}
