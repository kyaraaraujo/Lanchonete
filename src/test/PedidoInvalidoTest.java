package test;

import lanchonete.Item;
import lanchonete.Pedido;

public class PedidoInvalidoTest {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        // deve imprimir: Impossivel processar item abcd, não há esse item no menu.
        Item item1 = new Item("abcd", 1);
        Item item2 = new Item("Xburg", 1);

        // não deve adicionar ao pedido
        pedido.adicionarItensAoPedido(item1, item2);

        // não deve imprimir
        pedido.imprimirPedido();

        // não deve imprimir
        pedido.imprimirValorAPagar();


    }

}
