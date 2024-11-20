package model;

public class SalesManager {
    private Stock stock;

    public SalesManager(Stock stock) {
        this.stock = stock;
    }

    public boolean processSale(Sale sale) {
        for (SaleItem item : sale.getSaleItems()) {
            if (!stock.checkAndDeductStock(item.getProduct().getDescription(), item.getQuantity())) {
                return false;
            }
        }
        System.out.println("Venda processada com sucesso!");
        return true;
    }
}
