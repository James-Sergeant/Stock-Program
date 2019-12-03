package com.company;
import com.company.StockItems.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Resistor> resistorList;
    private ArrayList<Capacitor> capacitorList;
    private ArrayList<Diode> diodeList;
    private ArrayList<IC> icList;
    private ArrayList<Transistor> transistorList;
    private ArrayList<StockItem> stockItemList;
    private ArrayList<StockItem> stockItemListSorted;
    private File file;

    public Inventory(File file)
    {
        resistorList = new ArrayList<Resistor>();
        capacitorList = new ArrayList<Capacitor>();
        diodeList = new ArrayList<Diode>();
        icList = new ArrayList<IC>();
        transistorList = new ArrayList<Transistor>();
        stockItemList = new ArrayList<StockItem>();
        stockItemListSorted = new ArrayList<StockItem>();


        this.file = file;
        loadFile();
    }
    //Used to read in the file, also calls the createObejct method.
    private void loadFile()
    {
        //Try catch to prevent crashes on incorrect file paths/non-existence file.
        try
        {
            Scanner sc = new Scanner(System.in);
            sc = new Scanner(file);
            //For each line in the file a new object is created.
            while (sc.hasNextLine())
            {
                String temp = sc.nextLine();
                createObject(temp);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            //Prints the stack trace and the file full file path.
            e.printStackTrace();
            System.err.println(file.getAbsolutePath());
        }
        //Adds each item type to a master list to all processing of the data.
        stockItemList.addAll(resistorList);
        stockItemList.addAll(capacitorList);
        stockItemList.addAll(diodeList);
        stockItemList.addAll(icList);
        stockItemList.addAll(transistorList);
    }

    //Used to create the objects for the different types of Stock Item
    private void createObject(String string)
    {
        String type = "", id ="", noOfItems ="", price ="", info="";

        //Converts the string into the attributes for the Object.
        int count =0;
        for(int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) != ',')
            {
                switch (count)
                {
                    case 0:
                        type = type + string.charAt(i);
                        break;
                    case 1:
                        id = id + string.charAt(i);
                        break;
                    case 2:
                        noOfItems = noOfItems + string.charAt(i);
                        break;
                    case 3:
                        price = price + string.charAt(i);
                        break;
                    case 4:
                        info= info + string.charAt(i);
                        break;
                }
            }
            else{
                i++;
                count++;
            }

        }
        //determines the stock item type to place in the correct array list.
        switch(type){
            case "resistor":
                resistorList.add(new Resistor(id,noOfItems,price,info));
                break;
            case "capacitor":
                capacitorList.add(new Capacitor(id,noOfItems,price,info));
                break;
            case "diode":
                diodeList.add(new Diode(id,noOfItems,price,info));
                break;
            case "IC":
                icList.add(new IC(id,noOfItems,price,info));
                break;
            case "transistor":
                transistorList.add(new Transistor(id,noOfItems,price,info));
                break;
            default:
                //System.out.println("Type " + type + " Not found");
                break;

        }
        //File reader test:
        //System.out.println(type +" "+id+" "+noOfItems+" "+price+" "+info);
    }

    //Task Answers:
    //1:
    public void sortInvent(){
        stockItemListSorted.addAll(MergeSort.sort(stockItemList));
        System.out.println(stockItemListSorted);
    }

    //2:
    public void  largestNoComponents(){
        StockItem max = new StockItem("0","0" ,"0" ,"0");
        for(StockItem i: stockItemList){
          if(i.getNumberOfItems() > max.getNumberOfItems()){
              max = i;
          }
      }

      System.out.println("The largest number of components  " + max.getId());


    }
    //3:
    public void getNPN(){
        int count =0;
        for (Transistor i: transistorList ){
            if(i.getInfo().equals("NPN")){
                count += i.getNumberOfItems();
            }
        }
        System.out.println("There are: "+count+" NPN transistors");
    }

    //4:
    public void totalResistance(){
        double total = 0;
        for(Resistor i: resistorList){
           total += i.totalResistnace();
        }
        System.out.println("Total Resistance: " + total + " \u03A9");
    }

    //5:
    public void aboveX(int x){
        int count = 0;
        for(StockItem i: stockItemListSorted){
            if(i.getPrice() > x){
                break;
            }
            else{
                count++;
            }
        }
        List<StockItem> out = stockItemListSorted.subList(count, stockItemListSorted.size());
        System.out.println("Items above " +x+ "p: "+ out.size());
    }
}
