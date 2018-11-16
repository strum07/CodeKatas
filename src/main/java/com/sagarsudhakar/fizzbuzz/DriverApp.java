package com.sagarsudhakar.fizzbuzz;

import java.util.concurrent.atomic.AtomicInteger;

public class DriverApp {
    public static void main(String[] args) {
        for(AtomicInteger i = new AtomicInteger(); i.get() <=100; i.getAndIncrement()){
            System.out.println(FizzBuzz.of(i.get()));
        }
    }
}
