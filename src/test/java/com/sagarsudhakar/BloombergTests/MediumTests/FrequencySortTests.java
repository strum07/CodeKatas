package com.sagarsudhakar.BloombergTests.MediumTests;

import com.sagarsudhakar.Bloomberg.Medium.FrequencySort;
import org.junit.Assert;
import org.junit.Test;

public class FrequencySortTests {

    @Test
    public void Sort_EmptyString_ReturnsEmptyString(){
        String input = "";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("",sortedString);
    }

    @Test
    public void Sort_LengthOneCharacterString_ReturnsInputString(){
        String input = "a";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("a",sortedString);

    }

    @Test
    public void Sort_LengthTwoSameCharacterString_ReturnsInputString(){
        String input = "aa";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("aa",sortedString);

    }

    @Test
    public void Sort_LengthTwoDifferentCharacterString_ReturnsInputString(){
        String input = "ab";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("ab",sortedString);

    }

    @Test
    public void Sort_Length3SameCharactersString_ReturnsInputString(){
        String input = "aaa";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("aaa",sortedString);
    }

    @Test
    public void Sort_Length3Different2CharactersString_ReturnsSortedString(){
        String input = "aba";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("aab",sortedString);
    }

    @Test
    public void Sort_Length3Different3CharactersString_ReturnsSortedString(){
        String input = "tree";
        String sortedString = FrequencySort.sequenceSort(input);
        Assert.assertEquals("eert",sortedString);
    }

}
