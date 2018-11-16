package com.sagarsudhakar.fizzbuzz;

public class FizzBuzz {

    private static final int FIZZ = 3;
    private static final int BUZZ = 5;

    public static String of(int input) {
        if(input==0)
           return String.valueOf(input);

        return _of(input);
    }

    private static String _of(int input) {
        StringBuilder fizzBuzzValue = new StringBuilder();

        if(isValidFizz(input))
            fizzBuzzValue.append("Fizz");

        if (isValidBuzz(input))
            fizzBuzzValue.append("Buzz");

        return fizzBuzzValue.length()<1?String.valueOf(input):fizzBuzzValue.toString();
    }

    private static boolean isValidFizz(int input){
        return checkFor(FIZZ, input);
    }

    private static boolean isValidBuzz(int input){
        return checkFor(BUZZ, input);
    }

    private static boolean checkFor(int checkNumber, int input){
        return (input%checkNumber==0) || String.valueOf(input).contains(String.valueOf(checkNumber));
    }
}
