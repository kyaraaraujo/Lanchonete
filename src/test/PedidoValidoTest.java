package test;


import src.Item;
import src.Pedido;

public class PedidoValidoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Item item1 = new Item("Refrigerante", 2);
        Item item2 = new Item("Batata Frita", 1);
        Item item3 = new Item("X-Burguer", 2);
        Item item4 = new Item("Baurú", 1);

        // deve adicionar os 4 itens ao pedido
        pedido.adicionarItensAoPedido(item1, item2, item3, item4);

        // deve imprimir os itens do pedido com quantaidade, valor unitário e valor total de cada
        pedido.imprimirPedido();

        // deve imprimir o valor total à pagar: R$ 30,60
        pedido.imprimirValorAPagar();

    }

}
