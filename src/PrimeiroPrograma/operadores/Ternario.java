package PrimeiroPrograma.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 3.6;
        String resultadoRecuperacao = media >= 5.0 ? "Recuperação." : "Reprovado.";
        String resultado = media >= 7.0 ? "Aprovado." : resultadoRecuperacao;

        System.out.println(resultado);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado2 =  temDesconto ? "sim" : "não";
        System.out.println(resultado2);
    }
}
