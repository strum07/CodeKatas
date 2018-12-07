package com.sagarsudhakar.Bloomberg.Medium;

/*
451. Sort Characters By Frequency
Medium

Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

 */

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class FrequencySort {
    public static String sort(String input) {
        if((input != null) || !input.isEmpty()){

            if(input.length()<3){
                return input;
            }

            HashMap<Character,Integer> frequencyMap = new HashMap<>();

            for(int i=0;i<input.length();i++){
                char element = input.charAt(i);
                frequencyMap.put(element,frequencyMap.getOrDefault(element,0)+1);
            }

            Map<Character,Integer> sortedMap = frequencyMap
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));

            int times;
            StringBuilder sb = new StringBuilder();
            for (char element : sortedMap.keySet()) {
                times = sortedMap.get(element);
                for (int k = 0; k < times; k++) {
                    sb.append(element);
                }
            }
            return sb.toString();
        }
        return "";
    }


    public String frequencySort(String input) {

        if (input==null || input.length()==0)
            return input;

        int inputLength = input.length();

        char[] charArray = new char[inputLength];

        int[] charFrequency = new int[128];

        for (char ch : input.toCharArray()) {
            charFrequency[ch]++;
        }
        int pos = 0;

        while (pos < inputLength) {
            char max = 0;

            for (int i = 0; i < charFrequency.length; i ++){

                if (charFrequency[i] > charFrequency[max]) {
                    max = (char)i;
                }
            }

            while (charFrequency[max] != 0) {
                charArray[pos++] = max;
                charFrequency[max]--;
            }
        }

        return new String(charArray);
    }

}
