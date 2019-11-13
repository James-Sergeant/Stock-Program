package com.company.StockItems;

public class Resistor extends StockItem
{
public static final String name = "RESISTOR";
    public Resistor(String stockCode, int noOfItems, int price, String extraInfo)
    {
        super(stockCode, noOfItems, price, extraInfo);
    }

    @Override
    public String toString()
    {
        return "Stock Code: "+this.stockCode+" Number of Items: "+noOfItems+" Price: "+price+"p Infomation: "+extraInfo+"\u03A9";
    }

}

