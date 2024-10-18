package PrimeiroPrograma;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; // ao adicionar o final na frente do tipo, estamos definindo uma constante, que não pode ser alterada, por convenção também usamos constantes com letras maísculas.

        double area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
