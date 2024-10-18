package PrimeiroPrograma.controles;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // domingo -> 1, segunda -> 2, terça -> 3, e etc..

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = sc.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Opção inválida!!");
        }

        sc.close();
    }
}
