package oo.heranca;

public class Jogador {
    public int vida = 100;
    public int x;
    public int y;

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
        } else if(deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
        }
    }

    public void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y--;
            case LESTE -> x++;
            case SUL -> y++;
            case OESTE -> x--;
        }
    }
}
