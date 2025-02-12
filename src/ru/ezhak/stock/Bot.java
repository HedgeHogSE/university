package ru.ezhak.stock;

public class Bot implements StockObserver {

    private final int threshold;

    public Bot(int threshold) {
        this.threshold = threshold;
    }
    @Override
    public void update(Stock stock) {
        if (stock.getPrice() < threshold) {
            System.out.println("Покупайте " + stock.getName() + "!!!");
        }
    }
}
