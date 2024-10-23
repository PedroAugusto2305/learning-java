package classe;

public class ValorVersusReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data("01", "06", "2022");
        Data d2 = d1; // atribuição por referência (objeto)

        d1.dia = "31";
        d2.mes = "12";

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    // gera impacto pra "fora"
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = "1";
        d.mes = "1";
        d.ano = "1970";
    }

    // não gera impacto pra "fora"
    static void alterarPrimitivo(int a) {
        a++;
    }
}
