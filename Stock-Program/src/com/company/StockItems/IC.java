package com.company.StockItems;

public class IC extends StockItem {

    public static final String NAME = "IC";

    public IC(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }

    public String toString(){
        return this.NAME +": "+ super.toString() + "\n";
    }
}
