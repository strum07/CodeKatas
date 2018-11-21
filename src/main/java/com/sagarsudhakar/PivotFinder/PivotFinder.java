package com.sagarsudhakar.PivotFinder;

public class PivotFinder {


    public static int findPivot(int[] arr) {
        int pivot = -1;

        if(arr.length<3)
            return pivot;

        for(int i=1; i<arr.length-1;i++){
                if(arr[i]>=arr[i-1] && arr[i]>arr[i+1])
                    return i;
        }

        return pivot;
    }
}
