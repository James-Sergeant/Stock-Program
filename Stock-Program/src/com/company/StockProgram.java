/*      * Project           : Basic Inventroy System
        *
        * Program name      : StockProgram.java
        *
        * Author            : afa19aeu
        *
        * Date created      : 25/11/19
        *

        * Purpose           : To allow the user to import an inventory of items with a text file.
*/

package com.company;
import java.io.File;

public class StockProgram
{
    public static final File file = new File( "inventory.txt");
    //Creates a array list of items
    public static void main(String[] args)
    {
        Inventory iv = new Inventory(file);
    }



}
