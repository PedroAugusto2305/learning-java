package oo.heranca;

public class Heroi extends Jogador{
    public Heroi(int x, int y) {
        super(x, y);
    }
    public void atacar(Jogador oponente) {
        super.atacar(oponente);
        super.atacar(oponente);
        super.atacar(oponente);

    }
}
