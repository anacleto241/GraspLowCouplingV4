package model;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<String, StockItem> stockItems = new HashMap<>();

    public void addStockItem(String description, int quantity) {
        stockItems.put(description, new StockItem(description, quantity));
    }

    public boolean checkAndDeductStock(String description, int quantity) {
        StockItem stockItem = stockItems.get(description);
        if (stockItem != null && stockItem.getQuantity() >= quantity) {
            stockItem.deductQuantity(quantity);
            return true;
        }
        System.out.println("Estoque insuficiente para o produto: " + description);
        System.out.println("Quantidade contida na venda: "+quantity);
        System.out.println("Estoque atual do produto: "+stockItem.getQuantity());
        return false;
    }
}
