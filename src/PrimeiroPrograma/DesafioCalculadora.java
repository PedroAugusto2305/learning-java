package PrimeiroPrograma;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual das opções abaixo deseja realizar? (digite o número da opção desejada)");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Módulo");
        String opcao = sc.nextLine();

        double adicao = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;

        String resultado =  opcao.equals("1") ? String.valueOf(adicao) : opcao.equals("2") ? String.valueOf(subtracao) : opcao.equals("3") ? String.valueOf(multiplicacao) : opcao.equals("4") ? String.valueOf(divisao) : opcao.equals("5") ? String.valueOf(modulo) : "Opção inválida";
        System.out.println(resultado);

        sc.close();

    }
}
