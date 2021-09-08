package src;

public class Item extends CardapioLanches {
    protected String item;
    protected int quantidade;
    protected double preco;


    public Item(String item, int quantidade) {
        // get() do Map vai retornar o valor da chave informada, retorna valor null se não encontra a chave
        Double valorDoItem = getCardapio().get(item);
        if(valorDoItem != null){
            this.item = item;
            this.quantidade = quantidade;
            this.preco = valorDoItem;
        } else {
            System.out.println("Impossivel processar item " + item + ", não há esse item no cardápio.");
        }
    }



}
