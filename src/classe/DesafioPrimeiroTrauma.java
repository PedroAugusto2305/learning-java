package classe;

public class DesafioPrimeiroTrauma {
    int a = 3;
    public static void main(String[] args) {

        // é necessário instanciar a propria classe para ter acesso a uma váriavel fora do método main, por ser um método estático
        DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
        System.out.println(p.a);
    }
}
