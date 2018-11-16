package com.sagarsudhakar.fizzbuzztests;

import com.sagarsudhakar.fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTests
{

    @Test
    public void FizzBuzz_Of_0is0(){
        assertEquals("0", FizzBuzz.of(0));
    }


    @Test
    public void FizzBuzz_Of_1is1(){
        assertEquals("1",FizzBuzz.of(1));
    }


    @Test
    public void FizzBuzz_Of_3isFizz(){
        assertEquals("Fizz",FizzBuzz.of(3));
    }

    @Test
    public void FizzBuzz_Of_5isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(5));
    }

    @Test
    public void FizzBuzz_Of_6isFizz(){
        assertEquals("Fizz",FizzBuzz.of(6));
    }

    @Test
    public void FizzBuzz_Of_10isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(10));
    }

    @Test
    public void FizzBuzz_Of_15isFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.of(15));
    }

    @Test
    public void FizzBuzz_Of_737isFizz(){
        assertEquals("Fizz",FizzBuzz.of(737));
    }


    @Test
    public void FizzBuzz_Of_757isFizz(){
        assertEquals("Buzz",FizzBuzz.of(757));
    }

    @Test
    public void FizzBuzz_Of_7537isFizz(){
        assertEquals("FizzBuzz",FizzBuzz.of(7537));
    }
}
