package PrimeiroPrograma;

public class Inferencia {
    public static void main(String[] args) {

        double a = 2.5;
        System.out.println(a);

        // ao usar o var, o Java infere o tipo da váriavel baseado no valor que for informado, no caso abaixo um tipo double
        var b = 2.5;
        System.out.println(b);

        // abaixo será inferido o tipo string
        var c = "Texto";
        System.out.println(c);

        // o caso abaixo dará um erro, pois o java é uma linguagem com tipagem estática, então não é possível alterar o um tipo de uma variável após sua inicialização
        // c = 2.5;

        // também podemos declarar uma variável sem inicializá-la, porém não é possível fazer isso com o var.
        double d;
        d = 123.65;
        System.out.println(d);
    }
}
