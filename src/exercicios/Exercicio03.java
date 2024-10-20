package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quanto o valor ganho por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no último mês: ");
        int horaTrabalhada = sc.nextInt();

        double salario = valorHora * horaTrabalhada;

        System.out.printf("Seu salário será de: R$%.2f", salario);

        sc.close();
    }
}
