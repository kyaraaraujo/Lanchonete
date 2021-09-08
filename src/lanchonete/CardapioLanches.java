package lanchonete;

import java.util.Map;
import static java.util.Map.entry;

public abstract class CardapioLanches {

    private static final Map<String, Double> cardapio = Map.ofEntries(
            entry("Baurú", 8.50),
            entry("X-Burguer", 5.50),
            entry("Batata Frita", 6.50),
            entry("Refrigerante", 2.30)
    );

    public static void mostrarCardapio() {
        System.out.println("---------- CARDÁPIO ----------");
        for (String key : cardapio.keySet()) {
            Double value = cardapio.get(key);
            System.out.printf("- %-15s = R$ %.2f - \n", key, value);
        }
        System.out.println("------------------------------");
    }

    public static Map<String, Double> getCardapio() {
        return cardapio;
    }

}
