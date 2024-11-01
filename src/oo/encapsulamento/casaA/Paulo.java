package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcessos() {
        // System.out.println(esposa.segredo); // não acessível
        System.out.println(esposa.facoDentroDeCasa); // acessível
        System.out.println(esposa.formaDeFalar); // acessível
        System.out.println(esposa.todosSabem); // acessível

    }
}
