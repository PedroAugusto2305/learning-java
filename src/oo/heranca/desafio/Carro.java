package oo.heranca.desafio;

public class Carro {
    // velocidade atual, metodo acelerar (5 em 5), metodo frear (5 em 5), velocidade nunca pode ser menor que zero
    final public int VELOCIDADE_MAXIMA;
    public double velocidadeAtual = 0;
    private int delta = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= delta;
        } else {
            System.out.println("O carro está parado, impossível frear.");
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
