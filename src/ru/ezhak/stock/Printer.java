package ru.ezhak.stock;

import java.util.ArrayList;
import java.util.List;

public class Printer implements StockObserver {
    private static List<Stock> stocks = new ArrayList<>();

    @Override
    public void update(Stock stock) {
        addStock(stock);
        for (Stock stock1 : stocks) {
            System.out.printf("Цена за %s: %d\n", stock1.getName(), stock1.getPrice());
        }
    }

    private void addStock (Stock stock) {
        if (!stocks.contains(stock)) {
            stocks.add(stock);
        }
    }
}
