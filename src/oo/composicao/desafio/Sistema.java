package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pedro Augusto");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1877.9), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10.0, 10);
        compra2.adicionarItem(new Produto("Impressora", 998), 1);

        cliente1.adicionarCompra(compra1);
        cliente1.compras.add(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
