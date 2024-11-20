package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addStockItem("Arroz Tatiana", 10);
        stock.addStockItem("Feijão Fejó", 5);
        stock.addStockItem("Macarrão Santa Amália", 8);

        SalesManager salesManager = new SalesManager(stock);


        Sale sale = new Sale();
        sale.createSaleItem("at", 2); 
        sale.createSaleItem("ff", 7); 
        sale.createSaleItem("msa", 1); 


        if (salesManager.processSale(sale)) {
            sale.setPaymentMethod("cc");

            for (String item : sale.getItems())
                System.out.println(item);

            System.out.println(String.format("Total: %.2f", sale.getTotal()));
            System.out.println(String.format("Forma de pagamento: %s", sale.getPaymentMethod()));
            System.out.println(String.format("Valor a ser pago: R$%.2f", sale.getFinalPrice()));
        }
    }
}
