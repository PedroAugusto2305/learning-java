package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro popular = new Civic();
        Carro esportivo = new Ferrari();

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

        esportivo.frear();
        esportivo.frear();
        esportivo.frear();
        esportivo.frear();
        esportivo.frear();
        esportivo.frear();
        esportivo.frear();

        System.out.printf("Velocidade atual carro popular: %.1f km/h\n", popular.velocidadeAtual);
        System.out.printf("Velocidade atual carro esportivo: %.1f km/h\n", esportivo.velocidadeAtual);
    }
}
