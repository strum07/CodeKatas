package com.sagarsudhakar.hundredDoors;

import java.util.Arrays;

public class DriverApp {
    public static void main(String[] args) {

        boolean[] doors = new boolean[101];

        System.out.println(Arrays.toString(doors));

        for(int j=1;j<101;j++){
            for(int k=j;k<101;k=k+j){
                doors[k] = !doors[k];
            }
            System.out.println(Arrays.toString(doors));
        }

        System.out.println();
        System.out.println(Arrays.toString(doors));

        int count = 0;
        for(int i=1;i<101;i++){
            if(doors[i]){
                System.out.println("Door is open: "+(i));
                count++;
            }
        }

        System.out.println("Count: "+count);
    }
}
