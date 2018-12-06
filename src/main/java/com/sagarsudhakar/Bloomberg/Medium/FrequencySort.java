package com.sagarsudhakar.Bloomberg.Medium;

/*
451. Sort Characters By Frequency
Medium

Given a string, sequenceSort it in decreasing order based on the frequency of characters.

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

import java.util.ArrayList;

import java.util.HashMap;

public class FrequencySort {

    public static String sequenceSort(String input) {
        if((input != null) || !input.isEmpty()){
            if(input.length()<3){
                return input;
            }
            ArrayList<Character> sequence = new ArrayList<>();
            int counter = 0;
            HashMap<Character,Integer> frequencyMap = new HashMap<>();



            for(int i=0;i<input.length();i++){
                char inspect = input.charAt(i);

                if (frequencyMap.containsKey(inspect)) {
                    int times = frequencyMap.get(inspect);
                    frequencyMap.put(inspect,(times+1));
                } else {
                    sequence.add(inspect);
                    counter++;
                    frequencyMap.put(inspect,1);
                }
            }

            StringBuilder sb = new StringBuilder();
            int times = 0;

            for (char aSequence : sequence) {
                times = frequencyMap.get(aSequence);
                for (int k = 0; k < times; k++) {
                    sb.append(aSequence);
                }
            }

            System.out.println("Frequency Map Keys/Values:");
            System.out.println(frequencyMap.keySet());
            System.out.println(frequencyMap.values());

            System.out.println("Sequence:");
            System.out.println(sequence);


            return sb.toString();
        }

        return "";
    }


    public static String sort(String input){

        if((input != null) || !input.isEmpty()){

        }

        return "";

    }
}
