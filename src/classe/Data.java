package classe;

public class Data {
    // dia, mes e ano
    String dia;
    String mes;
    String ano;

    String obterDataFormatada() {
        return String.format("%s/%s/%s", dia, mes, ano);
    }
}
