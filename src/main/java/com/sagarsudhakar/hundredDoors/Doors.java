package com.sagarsudhakar.hundredDoors;

public class Doors {

    private boolean[] doors = new boolean[100];

    private int countOfOpenDoors;

    private int numberOfDoors;

    public Doors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;

        for(int i=0;i<numberOfDoors;i++){
            doors[i] = false;
        }
        countOfOpenDoors = 0;
    }

    public void incrementOpenDoors(){
        countOfOpenDoors++;
    }

    public void decrementOpenDoors(){
        countOfOpenDoors--;
    }

    public int getCountOfOpenDoors() {
        return countOfOpenDoors;
    }

    public int getCountOfClosedDoors() {
        return numberOfDoors-countOfOpenDoors;
    }

    public void printDoors(){
        StringBuilder doorPrint = new StringBuilder();
        for(int i=0;i<numberOfDoors;i++){
            if(!doors[i]){
                doorPrint.append("-C");
            }else{
                doorPrint.append("-O");
            }
        }

        System.out.println(doorPrint);
    }
}
