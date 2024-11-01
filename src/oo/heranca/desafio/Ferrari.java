package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    // acelera de 15 em 15
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
        setDelta(35);
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
        setDelta(15);
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void delisgarAr() {
        ligarAr = false;
    }

    //    public void acelerar() {
//        velocidadeAtual += 15;
//    }
}
