package com.company.StockItems;

public class Resistor extends StockItem
{
public static final String NAME = "Resistor";

    public Resistor(String stockCode, String noOfItems, String price, String extraInfo) {
        super(stockCode, noOfItems, price, extraInfo);
    }


    @Override
    public String toString()
    {
        return this.NAME +": "+super.toString() +"\u03A9 \n";
    }

    public String getName(){
        return this.NAME;
    }

    //This method just multiples the resistance with the number of items.
    public double totalResistnace(){
        double resistance = Double.valueOf(extraInfo);
        return resistance * noOfItems;
    }

}

