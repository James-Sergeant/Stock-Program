//This implements MergeSort, this is a recursive algorithm. O(nlog(n))

package com.company;

import com.company.StockItems.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort {

    public static List<StockItem> sort(List<StockItem> arr){
        // if the array is of one or less elements its sorted
        if (arr.size() <= 1) return arr;

        int mid = arr.size() /2;

        //Creates a left and right branch around the mid point.
        List<StockItem> left = arr.subList(0, mid);
        List<StockItem> right = arr.subList(mid, arr.size());

        //Recursively calls the algorithm, until each branch has one element.
        right = sort(right);
        left = sort(left);

        //Calls the merge method, to bring the branches back together in order.
        List<StockItem> result = merge(left, right);

        return result;

    }

    public static List<StockItem> merge(List<StockItem> left, List<StockItem> right){

        List<StockItem> result = new ArrayList<StockItem>();
        Iterator<StockItem> it1 = left.iterator();
        Iterator<StockItem> it2 = right.iterator();

        StockItem x = it1.next();
        StockItem y = it2.next();

        while(true){
            // uses the implementation of the compareTo method in the StockItem class, this looks at price.
            if(x.compareTo(y) <= 0){ //when they're equal, or x < y.
                result.add(x);
                if(it1.hasNext()){
                    x = it1.next(); //Iterates the value of x.
                }else{
                    result.add(y); //if there are no x values left.
                    while(it2.hasNext()){
                        result.add(it2.next()); //add all the y(remainder unsorted) vales to result.
                    }
                    break;
                }
            }else{ // if y < x
                result.add(y);
                if(it2.hasNext()){
                    y = it2.next(); //Iterates the value of y.
                }else {
                    result.add(x); //if there are no y values left.
                    while (it1.hasNext()) {
                        result.add(it1.next()); // add all x(remainder unsorted) to result.
                    }
                    break;
                }
        }

        }
        return result;
    }
}

/* SUDO code from: https://rosettacode.org/wiki/Sorting_algorithms/Merge_sort#Java
* function mergesort(m)
   var list left, right, result
   if length(m) ≤ 1
       return m
   else
       var middle = length(m) / 2
       for each x in m up to middle - 1
           add x to left
       for each x in m at and after middle
           add x to right
       left = mergesort(left)
       right = mergesort(right)
       if last(left) ≤ first(right)
          append right to left
          return left
       result = merge(left, right)
       return result

function merge(left,right)
   var list result
   while length(left) > 0 and length(right) > 0
       if first(left) ≤ first(right)
           append first(left) to result
           left = rest(left)
       else
           append first(right) to result
           right = rest(right)
   if length(left) > 0
       append rest(left) to result
   if length(right) > 0
       append rest(right) to result
   return result
* */
