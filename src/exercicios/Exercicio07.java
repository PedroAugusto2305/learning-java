package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double IR = 0.11;
        final double INSS = 0.08;
        final double SINDICATO = 0.05;

        System.out.println("Informe quanto o valor ganho por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no último mês: ");
        int horaTrabalhada = sc.nextInt();

        double salarioBruto = valorHora * horaTrabalhada;

        double descontoIR = salarioBruto * IR;
        double descontoINSS = salarioBruto * INSS;
        double descontoSindicato = salarioBruto * SINDICATO;

        double totalDesconto = descontoIR + descontoINSS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("+ Salário Bruto : R$ " + salarioBruto);
        System.out.println("- IR (11%) : R$ " + descontoIR);
        System.out.println("- INSS (8%) : R$ " + descontoINSS);
        System.out.println("- Sindicato (5%) : R$ " + descontoSindicato);
        System.out.println("= Salário Líquido : R$ " + salarioLiquido);

        sc.close();
    }
}
