package arrays;

public class Equals {
    public static void main(String[] args) {
        UsuarioEquals u1 = new UsuarioEquals();
        u1.nome = "Pedro Silva";
        u1.email = "pedro@email.com";

        UsuarioEquals u2 = new UsuarioEquals();
        u2.nome = "Pedro Silva";
        u2.email = "pedro@email.com";

        System.out.println(u1 == u2); // false -> agora retorna true, pois foi implementado o metodo equals na classe UsuarioEquals
        System.out.println(u1.equals(u2)); // false
    }

}
