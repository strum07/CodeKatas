//Problem 4: Moving Total

package com.sagarsudhakar.Assessment;

import java.util.*;

public class MovingTotal {

    private ArrayList<Integer> totals =  new ArrayList<>();
    private HashSet<Integer> totalMap = new HashSet<>();
    private int count = 0;
    private int currentElement = 0;

    /**
     * Adds/appends list of integers at the end of internal list.
     */
    private void append(int[] list) {
        for (int i : list)
        {
            this.totals.add(i);
            count=count+1;
            if(count>2){
                updateTotals();
            }
        }
    }

    private void updateTotals() {
            int first = totals.get(currentElement);
            int second = totals.get(currentElement+1);
            int third = totals.get(currentElement+2);
            int total = (first+second+third);
            totalMap.add(total);
            currentElement++;
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    private boolean contains(int total) {
            return totalMap.contains(total);
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));

        movingTotal.append(new int[] { 4 });

        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(10));

    }
}
