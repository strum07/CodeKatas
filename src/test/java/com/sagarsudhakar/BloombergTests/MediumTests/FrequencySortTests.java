package com.sagarsudhakar.BloombergTests.MediumTests;

import com.sagarsudhakar.Bloomberg.Medium.FrequencySort;
import org.junit.Assert;
import org.junit.Test;

public class FrequencySortTests {

    @Test
    public void Sort_EmptyString_ReturnsEmptyString(){
        String input = "";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("",sortedString);
    }

    @Test
    public void Sort_LengthOneCharacterString_ReturnsInputString(){
        String input = "a";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("a",sortedString);

    }

    @Test
    public void Sort_LengthTwoSameCharacterString_ReturnsInputString(){
        String input = "aa";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("aa",sortedString);

    }

    @Test
    public void Sort_LengthTwoDifferentCharacterString_ReturnsInputString(){
        String input = "ab";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("ab",sortedString);

    }

    @Test
    public void Sort_Length3SameCharactersString_ReturnsInputString(){
        String input = "aaa";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("aaa",sortedString);
    }

    @Test
    public void Sort_Length3Different2CharactersString_ReturnsSortedString(){
        String input = "aba";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("aab",sortedString);
    }

    @Test
    public void Sort_Length3Different3CharactersString_ReturnsSortedString(){
        String input = "abc";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("abc",sortedString);
    }

    @Test
    public void Sort_Length3Different4CharactersString_ReturnsSortedString(){
        String input = "abcd";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("abcd",sortedString);
    }


    @Test
    public void Sort_GivenExample1_ReturnsSortedString(){
        String input = "tree";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("eert",sortedString);
    }

    @Test
    public void Sort_GivenExample2_ReturnsSortedString(){
        String input = "cccaaa";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("aaaccc",sortedString);
    }

    @Test
    public void Sort_GivenExample3_ReturnsSortedString(){
        String input = "Aabb";
        String sortedString = FrequencySort.sort(input);
        Assert.assertEquals("bbAa",sortedString);
    }

}
