package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        // perguntar quantas notas o usuario quer informar, pegar as notas, 1o laço armazenar as notas no array, 2o laço usando foearch para somar e fazer a media
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas que deseja usar no cálculo da média: ");
        int tamArray = sc.nextInt();

        double[] notas = new double[tamArray];

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota: ");
            notas[i] = sc.nextDouble();
        }

        double media = 0;
        for(double nota: notas) {
            media +=  nota / notas.length;
        }

        System.out.println("A média do aluno é: " + media);

        sc.close();
    }
}
