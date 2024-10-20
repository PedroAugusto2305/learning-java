package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura em cm: ");
        double altura = sc.nextDouble() / 100;

        sc.nextLine();
        System.out.println("Informe seu gênero: (F/M)");
        String genero = sc.nextLine();
        if(genero.equalsIgnoreCase("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2fKg", pesoIdeal);
        } else if (genero.equalsIgnoreCase("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2fKg", pesoIdeal);
        } else {
            System.out.println("Gênero inválido. Use 'F' para feminino ou 'M' para masculino.");
        }

        sc.close();
    }
}
