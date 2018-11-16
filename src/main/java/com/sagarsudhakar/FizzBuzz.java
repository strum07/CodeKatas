package com.sagarsudhakar;

public class FizzBuzz {

    public static String of(int number) {
        if(number==0)
           return String.valueOf(number);

        return _of(number);
    }

    private static String _of(int number) {
        String value = "" ;

        if(number%3==0)
            value = "Fizz";

        if (number%5==0)
            value += "Buzz";

        return value.equals("")?String.valueOf(number):value;
    }
}
