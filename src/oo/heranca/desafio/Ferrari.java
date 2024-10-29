package oo.heranca.desafio;

public class Ferrari extends Carro {
    // acelera de 15 em 15
    Ferrari() {
        super(350);
    }
    void acelerar() {
        velocidadeAtual += 15;
    }
}
