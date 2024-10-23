package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        System.out.printf("%.2f\n", a1.area());

        System.out.println(AreaCirc.area(100));
    }
}
