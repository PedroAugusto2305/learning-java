package PrimeiroPrograma.controles;

public class For3 {
    public static void main(String[] args) {
        // a variável i está apenas no escopo do laço for
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
