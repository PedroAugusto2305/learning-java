package classe;

public class Data {
    // dia, mes e ano
    String dia;
    String mes;
    String ano;

    Data() {
        // 01/01/1970
        dia = "01";
        mes = "01";
        ano = "1970";
        // this("01, "01", "1970); -> this sendo usado como constructor, ele só pode ser usado dentro de outro construtctor

        /* valores padrão:
        * byte, short, int, long -> 0
        * float, double -> 0.0
        * booelan -> false
        * char -> '\u0000'
        * Objetos -> null */
    }

    Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%s/%s/%s"; // variável local
        return String.format(formato, dia, mes, ano);
    }
}
