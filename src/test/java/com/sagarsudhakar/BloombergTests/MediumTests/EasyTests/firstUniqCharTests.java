package com.sagarsudhakar.BloombergTests.MediumTests.EasyTests;

/*
387. First Unique Character in a String

 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

 */

import com.sagarsudhakar.Bloomberg.Easy.firstUniqChar;
import org.junit.Assert;
import org.junit.Test;

public class firstUniqCharTests {

    @Test
    public void find_EmptyString_ReturnsMinus1(){
        String input = "";
        Assert.assertEquals(-1, firstUniqChar.find(input));
    }

    @Test
    public void find_OneCharString_Returns0(){
        String input = "a";
        Assert.assertEquals(0, firstUniqChar.find(input));
    }

    @Test
    public void find_TwoCharString_ReturnsFirstUniqueCharIndex(){
        String input = "aba";
        Assert.assertEquals(1, firstUniqChar.find(input));
    }

    @Test
    public void find_GivenTestCase1_ReturnsFirstUniqueCharIndex(){
        String input = "leetcode";
        Assert.assertEquals(0, firstUniqChar.find(input));
    }

    @Test
    public void find_GivenTestCase2_ReturnsFirstUniqueCharIndex(){
        String input = "loveleetcode";
        Assert.assertEquals(2, firstUniqChar.find(input));
    }


}
