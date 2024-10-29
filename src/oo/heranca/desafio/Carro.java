package oo.heranca.desafio;

public class Carro {

    // velocidade atual, metodo acelerar (5 em 5), metodo frear (5 em 5), velocidade nunca pode ser menor que zero
    double velocidade = 0;

    void acelerar() {
        velocidade += 5;
    }

    void frear() {
        if (velocidade > 0) {
            velocidade -= 5;
        } else {
            System.out.println("O carro está parado, impossível frear.");
        }
    }
}
