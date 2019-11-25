package com.company.StockItems;

public class Capacitor extends StockItem
{
    public static final String NAME = "Capacitor";

    public Capacitor(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }
    @Override
    public String toString(){
        return this.NAME +": "+ super.toString() + "F \n";
    }
}
