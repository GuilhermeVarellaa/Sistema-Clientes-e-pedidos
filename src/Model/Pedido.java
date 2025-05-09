package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProdutos(Produto p){
        produtos.add(p);
    }

    public double calcularTotal(){
        double total = 0;
        for(Produto p : produtos){
            total += p.getPreco();
        }
        return total;
    }

        public  void exibirResumo(){
            System.out.println("Cliente: " + cliente.getNome() + "CPF: " + cliente.getCpf());
            for (Produto p : produtos){
                System.out.println("- " + p.getNome() + "| R$" + p.getPreco());
            }
            System.out.println("Total do pedido: " + calcularTotal());
            System.out.println("--------------------------");
        }
}
