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
        //Creates a new inventory for the file.
        Inventory iv = new Inventory(file);

        //Answer to the first requirement.
        iv.sortInvent();
        System.out.println();
        //Answer to the second requirement.
        iv.largestNoComponents();
        System.out.println();
        //Answer to the third requirement.
        iv.totalResistance();
        System.out.println();
        //Answer to the forth requirement.
        iv.getNPN();
        System.out.println();
        //Answer to the last requirement.
        iv.aboveX(10);
    }


}
