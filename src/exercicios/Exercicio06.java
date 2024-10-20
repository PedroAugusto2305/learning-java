package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de peixes pescados (kg)");
        double peso = sc.nextDouble();

        final double EXCESSO = 50.0;
        final double MULTA = 4.00;

        if (peso > EXCESSO) {
            double pesoExcedido = peso - EXCESSO;
            double totalMulta = pesoExcedido * MULTA;

            System.out.printf("Você pescou %.2fkg de peixe, então terá que pagar uma multa no valor de R$%.2f.", peso, totalMulta);
        } else {
            System.out.printf("Você pescou %.2fkg de peixe, então não terá que pagar multa.", peso);
        }
    }
}
