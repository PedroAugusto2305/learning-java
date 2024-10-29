package oo.heranca;

public class Heroi extends Jogador{
    Heroi(int x, int y) {
        super(x, y);
    }
    void atacar(Jogador oponente) {
        super.atacar(oponente);
        super.atacar(oponente);
        super.atacar(oponente);

    }
}
