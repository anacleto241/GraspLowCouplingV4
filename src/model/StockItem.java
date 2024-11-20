package model;

public class StockItem {
    private String description;
    private int quantity;

    public StockItem(String description, int quantity) {
        this.description = description;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void deductQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public String getDescription() {
        return description;
    }
}
