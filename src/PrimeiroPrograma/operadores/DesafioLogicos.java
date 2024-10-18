package PrimeiroPrograma.operadores;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {
        // trabalho na terça, trabalho na quinta, eles podem ser V ou F, se os dois trabalhos derem certo = comprar tv 50, se apenas um trabalho tv 32, e nos dois casos familia tomar sorvete

        Scanner sc = new Scanner(System.in);

        System.out.println("Você recebeu o trabalho de terça? (sim/não)");
        String trabalhoTerca = sc.nextLine();

        System.out.println("Você recebeu o trabalho de quinta? (sim/não)");
        String trabalhoQuinta = sc.nextLine();

        if (trabalhoTerca.equalsIgnoreCase("sim") && trabalhoQuinta.equalsIgnoreCase("sim")) {
            System.out.println("Você e sua família irão ao Shopping comprar uma TV de 50 polegas, e além disso irão tomar um sorvete.");
        } else if (trabalhoTerca.equalsIgnoreCase("sim") || trabalhoQuinta.equalsIgnoreCase("sim")) {
            System.out.println("Você e sua família irão ao Shopping comprar uma TV de 32 polegas, e alem disso irão tomar um sorvete.");
        } else {
            System.out.println("Você e sua família não irão ao Shopping e evitarão de tomar sorvete que pode fazer mal a saude.");
        }

        sc.close();
    }
}
