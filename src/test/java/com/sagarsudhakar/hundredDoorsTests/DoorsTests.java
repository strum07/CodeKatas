package com.sagarsudhakar.hundredDoorsTests;

import com.sagarsudhakar.hundredDoors.Doors;
import org.junit.Assert;
import org.junit.Test;

public class DoorsTests {

    Doors ob = new Doors(100);

    @Test
    public void Doors_getCountOfOpenDoors_InitialStateIs0(){
        Assert.assertEquals(0, ob.getCountOfOpenDoors());
    }

    @Test
    public void Doors_getCountOfClosedDoors_InitialStateIs0(){
        Assert.assertEquals(100, ob.getCountOfClosedDoors());
    }
}
