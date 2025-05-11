package app;

import Model.Cliente;
import Model.Pedido;
import Model.Produto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Guilherme", "48019288888");
        Cliente cliente2 = new Cliente("João", "48019299999");

        Produto produto1 = new Produto("GTA VI", 650);
        Produto produto2 = new Produto("ps5", 4.900);
        Produto produto3 = new Produto("Bicleta", 1.000);
        Produto produto4 = new Produto("Banco de mobilete", 120);



       Pedido pedido1 = new Pedido(cliente1);
       Pedido pedido2 = new Pedido(cliente2);



       pedido1.adicionarProdutos(produto1);
       pedido1.adicionarProdutos(produto2);

       pedido2.adicionarProdutos(produto3);
       pedido2.adicionarProdutos(produto4);

       pedido1.exibirResumo();
       pedido2.exibirResumo();






    }
}