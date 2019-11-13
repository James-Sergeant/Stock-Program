package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockProgram
{
    public static final File file = new File( "src/com/company/inventory.txt");
    //Creates a array list of items
    public static void main(String[] args)
    {
        Inventory iv = new Inventory(file);
    }



}
