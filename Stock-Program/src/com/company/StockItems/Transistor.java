package com.company.StockItems;

public class Transistor extends StockItem {

    public static final String NAME = "Transistor";

    public Transistor(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }

    public String toString(){
        return this.NAME +": "+ super.toString() + "\n";
    }

}
