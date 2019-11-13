package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList ar;
    private File file;

    public Inventory(File file)
    {
        ar = new ArrayList();
        this.file = file;
        loadFile();
    }

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
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            System.err.println(file.getAbsolutePath());
        }
    }


    public void createObject(String string)
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
                    case 4:
                        info= info + string.charAt(i);
                }
            }
            else{
                i++;
                count++;
            }
        }
        //File reader test:
        System.out.println(type +" "+id+" "+noOfItems+" "+price+" "+info);
    }
}
