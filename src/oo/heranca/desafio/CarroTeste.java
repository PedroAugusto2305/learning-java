package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro popular = new Civic();
        Carro esportivo = new Ferrari();

        popular.acelerar();
        popular.acelerar();
        esportivo.acelerar();
        esportivo.acelerar();
        System.out.printf("Velocidade atual carro popular: %.1f km/h\n", popular.velocidade);
        System.out.printf("Velocidade atual carro esportivo: %.1f km/h\n", esportivo.velocidade);
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

        System.out.printf("Velocidade atual carro popular: %.1f km/h\n", popular.velocidade);
        System.out.printf("Velocidade atual carro esportivo: %.1f km/h\n", esportivo.velocidade);
    }
}
