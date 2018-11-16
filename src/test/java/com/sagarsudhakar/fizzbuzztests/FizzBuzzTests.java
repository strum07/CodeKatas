package com.sagarsudhakar.fizzbuzztests;

import com.sagarsudhakar.fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTests
{

    @Test
    public void FizzBuzz_Of_0_is0(){
        assertEquals("0", FizzBuzz.of(0));
    }


    @Test
    public void FizzBuzz_Of_1_is1(){
        assertEquals("1",FizzBuzz.of(1));
    }


    @Test
    public void FizzBuzz_Of_3_isFizz(){
        assertEquals("Fizz",FizzBuzz.of(3));
    }

    @Test
    public void FizzBuzz_Of_5_isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(5));
    }

    @Test
    public void FizzBuzz_Of_6_isFizz(){
        assertEquals("Fizz",FizzBuzz.of(6));
    }

    @Test
    public void FizzBuzz_Of_10_isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(10));
    }

    @Test
    public void FizzBuzz_Of_15_isFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.of(15));
    }

    @Test
    public void FizzBuzz_Of_737_isFizz(){
        assertEquals("Fizz",FizzBuzz.of(737));
    }


    @Test
    public void FizzBuzz_Of_757_isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(757));
    }

    @Test
    public void FizzBuzz_Of_7537_isFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.of(7537));
    }

    @Test
    public void FizzBuzz_Of_1111_is1111(){
        assertEquals("1111",FizzBuzz.of(1111));
    }
}
