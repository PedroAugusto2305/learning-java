package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da área que deseja pintar: (m²)");
        double area = sc.nextDouble();

        final double RENDIMENTO_LITRO = 3.0;
        final double LITROS_POR_LATA = 18.0;
        final double PRECO_POR_LATA = 80.00;

        double litrosNecessarios = area / RENDIMENTO_LITRO;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / LITROS_POR_LATA);
        double precoTotal = latasNecessarias * PRECO_POR_LATA;

        System.out.printf("Você precisará de %d latas de tinta e o custo total será de %.2f", latasNecessarias, precoTotal);
    }
}
