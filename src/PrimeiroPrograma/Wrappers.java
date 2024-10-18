package PrimeiroPrograma;

public class Wrappers {
    public static void main(String[] args) {
        // para cada tipo primitivo existe uma versão objeto.

        // byte
        Byte b = 100;
        // short
        Short s = 1000;
        // int
        Integer i = 10000;
        Integer i2 = Integer.parseInt("10000"); // converter uma string para int
        // long
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(l);

        // float
        Float f = 123.0F;
        // double
        Double d = 1234.56789;

        System.out.println(f);
        System.out.println(d);

        // boolean
        Boolean bo = Boolean.parseBoolean("true"); // retorna um valor booleano
        System.out.println(bo);

        // char
        Character c = '#';
        System.out.println(c + "...");
    }
}
