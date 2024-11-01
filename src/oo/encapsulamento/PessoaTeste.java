package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 30);
        p1.setIdade(28); // alterar valor da variável
        System.out.println(p1.getIdade()); // leitura do valor da variável
        System.out.println(p1);
    }
}
