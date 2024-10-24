package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int quantidadeAlunos = sc.nextInt();

        System.out.println("Quantas novas por aluno?");
        int quantidadeNotas = sc.nextInt();

        double[][] notasDaTruma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for(int i = 0; i < notasDaTruma.length; i++) {
            for(int j = 0; j < notasDaTruma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasDaTruma[i][j] = sc.nextDouble();
                total += notasDaTruma[i][j];
            }
        }

        for(double[] notasDoAluno: notasDaTruma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da turma é: " + media);

        sc.close();
    }
}
