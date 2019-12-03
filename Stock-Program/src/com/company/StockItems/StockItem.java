package com.company.StockItems;

public class StockItem implements Comparable<StockItem>
{
   protected String stockCode, extraInfo;
    protected int noOfItems, price;

    public  StockItem(String stockCode, String noOfItems,String price, String extraInfo)
    {
        this.stockCode = stockCode;
        //used to catch the possibility of NAN.
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

    public int getNumberOfItems(){return noOfItems;}

    public String getId()
    {
        return stockCode;
    }

    //When two stock items are compared it will be based off of the price.
    @Override
    public int compareTo(StockItem i) {
        if(this.getPrice() < i.getPrice()) return -1;
        if(this.getPrice() > i.getPrice()) return 1;
        else return 0;
    }
}
