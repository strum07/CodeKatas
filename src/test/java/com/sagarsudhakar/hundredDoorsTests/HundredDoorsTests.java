package com.sagarsudhakar.hundredDoorsTests;

import com.sagarsudhakar.hundredDoors.HundredDoors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HundredDoorsTests {

    HundredDoors ob = new HundredDoors();

    @Test
    public void HundredDoors_getCountOfOpenDoors_initalStateis0(){
        Assert.assertEquals(0, ob.getCountOfOpenDoors());
    }

    @Test
    public void HundredDoors_getCountOfClosedDoors_initalStateis0(){
        Assert.assertEquals(100, ob.getCountOfClosedDoors());
    }
}
