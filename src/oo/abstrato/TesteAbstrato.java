package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Mamifero floki = new Cachorro();
        System.out.println(floki.mover());
        System.out.println(floki.mamar());
        System.out.println(floki.respirar());
    }
}
