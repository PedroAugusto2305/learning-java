package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi(10, 11);

        System.out.println("Herói tem: " + heroi.vida + " pontos de vida.");
        System.out.println("Monstro tem: " + monstro.vida + " pontos de vida.");

        System.out.println("------Primeira rodada------");

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println("Herói tem: " + heroi.vida + " pontos de vida.");
        System.out.println("Monstro tem: " + monstro.vida + " pontos de vida.");

        System.out.println("------Segunda rodada------");

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println("Herói tem: " + heroi.vida + " pontos de vida.");
        System.out.println("Monstro tem: " + monstro.vida + " pontos de vida.");

        System.out.println("------Terceira rodada------");

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println("Herói tem: " + heroi.vida + " pontos de vida.");
        System.out.println("Monstro tem: " + monstro.vida + " pontos de vida.");
    }
}
