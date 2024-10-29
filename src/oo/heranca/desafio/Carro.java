package oo.heranca.desafio;

public class Carro {
    // velocidade atual, metodo acelerar (5 em 5), metodo frear (5 em 5), velocidade nunca pode ser menor que zero
    final int VELOCIDADE_MAXIMA;
    double velocidadeAtual = 0;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= delta;
        } else {
            System.out.println("O carro está parado, impossível frear.");
        }
    }
}
