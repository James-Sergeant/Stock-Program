package com.company.StockItems;

public class StockItem
{
   protected String stockCode, extraInfo;
    protected int noOfItems, price;

    public  StockItem(String stockCode, int noOfItems,int price, String extraInfo)
    {
        this.stockCode = stockCode;
        this.noOfItems = noOfItems;
        this.price = price;
        this.extraInfo = extraInfo;
    }

    public String toString()
    {
        return "Stock Code: "+this.stockCode+" Number of Items: "+noOfItems+" Price: "+price+"p Infomation: "+extraInfo;
    }
    public int getPrice()
    {
        return price;
    }
}
