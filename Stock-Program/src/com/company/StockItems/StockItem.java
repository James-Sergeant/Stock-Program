package com.company.StockItems;

public class StockItem
{
   protected String stockCode, extraInfo;
    protected int noOfItems, price;

    public  StockItem(String stockCode, String noOfItems,String price, String extraInfo)
    {
        this.stockCode = stockCode;
        try {
            this.noOfItems = Integer.parseInt(noOfItems);
            this.price = Integer.parseInt(price);
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
    public String getInfo()
    {
        return extraInfo;
    }

}
