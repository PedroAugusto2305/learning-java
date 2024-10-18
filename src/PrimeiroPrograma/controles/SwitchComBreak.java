package PrimeiroPrograma.controles;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 10, 9:
                conceito = "A";
                break;
            case 8, 7:
                conceito = "B";
                break;
            case 6, 5:
                conceito = "C";
                break;
            case 4, 3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "E";
                break;
            default:
                System.out.println("Conceito não informado!");
        }

        System.out.println("Conceito é " + conceito);

        // forma alternativa de fazer o switch (mais moderna)
        switch (nota) {
            case 10, 9 -> conceito = "A";
            case 8, 7 -> conceito = "B";
            case 6, 5 -> conceito = "C";
            case 4, 3 -> conceito = "D";
            case 2, 1, 0 -> conceito = "E";
            default -> System.out.println("Conceito não informado!");
        }

        System.out.println("Conceito é " + conceito);
    }
}
