package PrimeiroPrograma.controles;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // calcular a média de uma quantidade de n alunos

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        String texto = "";
        int quantidadeNotas = 0;
        double total = 0;

        while(!texto.equalsIgnoreCase("sair")) {
            System.out.println("Digite a nota do aluno(a)");
            nota = sc.nextDouble();
            total += nota;

            sc.nextLine();
            System.out.println("Deseja sair?");
            texto = sc.nextLine();
            quantidadeNotas++;
        }

        double media = total / quantidadeNotas;
        System.out.println("A média é: " + media);

        sc.close();
    }
}