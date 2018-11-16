package com.sagarsudhakar.hundredDoors;

public class HundredDoors {

    private int[] doors = new int[100];

    private int countOfOpenDoors = 0;

    public int getCountOfOpenDoors() {
        return countOfOpenDoors;
    }

    public int getCountOfClosedDoors() {
        return 100-countOfOpenDoors;
    }
}
