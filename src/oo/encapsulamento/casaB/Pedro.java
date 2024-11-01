package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        /* System.out.println(segredo); -> não acessível
        *  System.out.println(facoDentroDeCasa); -> não acessível
        */
        System.out.println(formaDeFalar); // acessível
        System.out.println(todosSabem); // acessível

    }
}
