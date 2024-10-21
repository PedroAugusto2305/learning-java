package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = "23";
        d1.mes = "05";
        d1.ano = "1996";
        // System.out.printf("Eu nasci em %d de %s de %d.\n", d1.dia, d1.mes, d1.ano);
        System.out.println(d1.obterDataFormatada());

        Data d2 = new Data();
        d2.dia = "21";
        d2.mes = "10";
        d2.ano = "2024";
        System.out.println(d2.obterDataFormatada());
    }
}
