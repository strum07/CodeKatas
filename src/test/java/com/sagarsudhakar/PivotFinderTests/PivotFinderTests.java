package com.sagarsudhakar.PivotFinderTests;


// If an array if full of numbers that are always increasing, and then switches to always decreasing,
// write a function that will return the index of the pivot point within the array.

// element larger than its left and right

//[1, 2, 3, 4, 3, 2, 1]

// 4 is pivot


import com.sagarsudhakar.PivotFinder.PivotFinder;

import org.junit.Assert;
import org.junit.Test;

public class PivotFinderTests {


    @Test
    public void findPivot_EmptyArray_ReturnsInvalid(){
        int[] arr = {};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivot_SameElements_ReturnsInvalid(){
        int[] arr = {1,1,1,1,1};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivot_IncreasingOrder_ReturnsInvalid(){
        int[] arr = {1,2,3,4,5};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivot_DecreasingOrder_ReturnsInvalid(){
        int[] arr = {4,3,2,1};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivot_OnePivotPresent_ReturnsIndexOfPivot(){
        int[] arr = {1,2,3,4,3,2,1};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(3,pivotIndex);
    }

    @Test
    public void findPivot_MultiplePivotPresent_ReturnsInvalid(){
        int[] arr = {1,2,3,4,4,3,2,1};
        int pivotIndex = PivotFinder.findPivot(arr);
        Assert.assertEquals(-1,pivotIndex);
    }


    @Test
    public void findPivotBinary_EmptyArray_ReturnsInvalid(){
        int[] arr = {};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivotBinary_SameElements_ReturnsInvalid(){
        int[] arr = {1,1,1,1,1};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivotBinary_IncreasingOrder_ReturnsInvalid(){
        int[] arr = {1,2,3,4,5};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivotBinary_DecreasingOrder_ReturnsInvalid(){
        int[] arr = {4,3,2,1};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(-1,pivotIndex);
    }

    @Test
    public void findPivotBinary_OnePivotPresent_ReturnsIndexOfPivot(){
        int[] arr = {1,2,3,4,3,2,1};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(3,pivotIndex);
    }

    @Test
    public void findPivotBinary_MultiplePivotPresent_ReturnsInvalid(){
        int[] arr = {1,2,3,4,4,3,2,1};
        int pivotIndex = PivotFinder.findPivotBinarySearch(arr,0,arr.length-1);
        Assert.assertEquals(-1,pivotIndex);
    }
}
