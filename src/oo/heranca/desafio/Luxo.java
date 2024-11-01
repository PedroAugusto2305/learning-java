package oo.heranca.desafio;

public interface Luxo {
    void ligarAr();
    void delisgarAr();
    default int nivelDoAr() {
        return 1;
    }
}
