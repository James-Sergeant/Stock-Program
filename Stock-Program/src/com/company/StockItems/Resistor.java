package com.company.StockItems;

public class Resistor extends StockItem
{
public static final String name = "RESISTOR";

    public Resistor(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }


    @Override
    public String toString()
    {
        return super.toString() +"\u03A9";
    }

}

