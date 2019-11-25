package com.company;

import com.company.StockItems.Capacitor;
import com.company.StockItems.Resistor;
import com.company.StockItems.StockItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Resistor> resistorList;
    private ArrayList<Capacitor> CapacitorList;
    private ArrayList<Resistor> resistorList;
    private ArrayList<StockItem> stockItemList;
    private File file;

    public Inventory(File file)
    {
        resistorList = new ArrayList<Resistor>();
        this.file = file;
        loadFile();
    }
    //Used to read in the file, also calls the createObejct method.
    private void loadFile()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                String temp = sc.nextLine();
                createObject(temp);
            }
            sc.close();
            System.out.println(resistorList);
        }
        catch(FileNotFoundException e)
        {
            //Prints the stack trace and the file full file path.
            e.printStackTrace();
            System.err.println(file.getAbsolutePath());
        }
    }

    //Used to create the objects for the different types of Stock Item
    private void createObject(String string)
    {
        String type = "", id ="", noOfItems ="", price ="", info="";
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

            //Coverts the strings to int


        }
        switch(type){
            case "resistor":
                resistorList.add(new Resistor(id,noOfItems,price,info));
                break;
            default:
                //System.out.println("Type " + type + " Not found");
                break;



        }
        //File reader test:
        //System.out.println(type +" "+id+" "+noOfItems+" "+price+" "+info);
    }
}
