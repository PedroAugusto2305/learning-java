package PrimeiroPrograma;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em fahrenheit: ");
        double fahrenheit = sc.nextFloat();

        final int CONSTANT = 32;
        final double DIVISAO = 5/9.0;

        double celcius = (fahrenheit - CONSTANT) * DIVISAO;

        System.out.println("A temperatura " + fahrenheit + "ºF" + " em graus Célcius é: " + celcius + "ºC");
    }
}
