package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro popular = new Civic();
        Ferrari esportivo = new Ferrari(350);

        popular.acelerar();
        popular.acelerar();
        esportivo.acelerar();
        esportivo.acelerar();
        System.out.printf("Velocidade atual carro popular: %.1f km/h\n", popular.velocidadeAtual);
        System.out.printf("Velocidade atual carro esportivo: %.1f km/h\n", esportivo.velocidadeAtual);
        System.out.println();

        popular.frear();
        popular.frear();
        popular.frear();


        esportivo.ligarTurbo();
        esportivo.ligarAr();

        System.out.printf("Velocidade atual carro popular: %.1f km/h\n", popular.velocidadeAtual);
        System.out.printf("Velocidade atual carro esportivo: %.1f km/h\n", esportivo.velocidadeAtual);
    }
}
