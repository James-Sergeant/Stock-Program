package com.company.StockItems;

public class Diode extends StockItem {

    public static final String NAME = "Diode";

    public Diode(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, "Null");
    }
    public String toString(){
        return this.NAME +": "+ super.toString() + "\n";
    }

    public String getName(){
        return this.NAME;
    }
}
