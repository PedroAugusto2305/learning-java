package PrimeiroPrograma;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // conversão implícita, pois o valor é um número inteiro.
        System.out.println(a);

        float b = (float) 1.12345678999999; // conversão explícita (casting).
        System.out.println();

        int c = 130;
        byte d = (byte) c; // conversão explícita, porém perderá informação por conta do tamanho suportado pelo tipo.
        System.out.println(d);
    }
}
