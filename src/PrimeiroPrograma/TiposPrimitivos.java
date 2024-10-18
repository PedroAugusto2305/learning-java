package PrimeiroPrograma;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // é possível separar números com underline para facilitar a leitura em grandes valores.

        // tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; // ou true

        // tipo caractere
        char status = 'A'; // ativo

        // dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // número de viagens
        System.out.println(numeroDeVoos / 2);

        // pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + " ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
