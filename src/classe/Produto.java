package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    // construtor: recebe o mesmo nome da classe, e não recebe nenhum retorno
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (desconto + descontoDoGerente));
    }
}
