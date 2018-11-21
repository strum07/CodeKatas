package com.sagarsudhakar.PivotFinder;

public class PivotFinder {


    public static int findPivot(int[] inputArray) {
        int pivot = -1;

        if(inputArray.length<3)
            return pivot;

        for(int i=1; i<inputArray.length-1;i++){
                if(inputArray[i]>inputArray[i-1] && inputArray[i]>inputArray[i+1])
                    return i;
        }

        return pivot;
    }

    public static int findPivotBinarySearch(int[] inputArray , int start, int end) {
        int pivot = -1;

        if((end-start<3) || inputArray.length<3)
            return pivot;

        int mid = start+((end-start)/2);

        if(inputArray[mid]>inputArray[mid-1]&&inputArray[mid]>inputArray[mid+1])
            return mid;

        if(inputArray[mid]<inputArray[mid+1])
            return findPivotBinarySearch(inputArray, mid+1, end);

        return findPivotBinarySearch(inputArray,start,mid-1);
    }

}
