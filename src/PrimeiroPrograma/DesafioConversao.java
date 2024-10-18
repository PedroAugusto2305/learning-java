package PrimeiroPrograma;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu primeiro salário: ");
        String salario1 = sc.nextLine();

        System.out.println("Informe o seu segundo salário: ");
        String salario2 = sc.nextLine();

        System.out.println("Informe o seu terceiro salário: ");
        String salario3 = sc.nextLine();

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("A média dos três salários é: R$%.2f", media);

        sc.close();
    }
}
