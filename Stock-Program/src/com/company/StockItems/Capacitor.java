package com.company.StockItems;

public class Capacitor extends StockItem
{
    public static final String name = "CAPACITOR";
    public Capacitor(String stockCode, int noOfItems, int price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }
}
