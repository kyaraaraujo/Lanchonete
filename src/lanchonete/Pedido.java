package lanchonete;

import java.util.ArrayList;
import java.util.List;

public  class Pedido extends CardapioLanches {
    protected double valorAPagar;
    protected List<Item> itemsDoPedido = new ArrayList<>();

    public Pedido() {

    }

    public void adicionarItensAoPedido(Item... itens) {
        for (Item i : itens){
            if(i.item != null){
                itemsDoPedido.add(i);
            }
        }
    }

    public void imprimirPedido(){
        if(itemsDoPedido.isEmpty()){
            return;
        }
        String formatacaoTitulo = formatarImpressaoTituloItens();
        String formatacaoItens = formatarImpressaoItens();

        System.out.println("--------------- PEDIDO ---------------");
        System.out.printf(formatacaoTitulo, "ITEM", "UN", "PREÇO", "TOTAL");

        for (Item item : itemsDoPedido) {
            double total = item.quantidade * item.preco;
            System.out.printf(formatacaoItens, item.item, item.quantidade,item.preco, total);
        }
    }

    public void imprimirValorAPagar(){
        if(itemsDoPedido.isEmpty()){
            return;
        }
        System.out.println("--------------------------------------");
        System.out.printf("O valor total do seu pedido é R$ %.2f \n", calcularValorAPagar());
    }


    private double calcularValorAPagar() {
        double valorVezesQuantidade;

        for(Item item : itemsDoPedido){
            valorVezesQuantidade = item.preco * item.quantidade;
            valorAPagar += valorVezesQuantidade;
        }
        return valorAPagar;
    }

    private String formatarImpressaoTituloItens(){
        String colunaItem = "%-15s ";
        String colunaUn= "%2s ";
        String colunaValor = "%-7s ";

        return colunaItem + colunaUn + colunaValor + colunaValor + "\n";
    }

    private String formatarImpressaoItens(){
        String colunaItem = "%-15s ";
        String colunaUn= "%2d ";
        String colunaValor = "R$ %.2f ";

        return colunaItem + colunaUn + colunaValor + colunaValor + "\n";
    }

}
