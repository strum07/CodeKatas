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

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

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

            Map<Character,Integer> sortedMap = frequencyMap
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                    LinkedHashMap::new));

            System.out.println("String: "+input);
            System.out.println("Frequency Map Keys/Values:");
            System.out.println(frequencyMap.keySet());
            System.out.println(frequencyMap.values());
            System.out.println("Sorted Map:");
            System.out.println(sortedMap.keySet());
            System.out.println(sortedMap.values());
            System.out.println("Sequence:");
            System.out.println(sequence);

            StringBuilder sb1 = new StringBuilder();
            for (char aSequence : sortedMap.keySet()) {
                times = sortedMap.get(aSequence);
                for (int k = 0; k < times; k++) {
                    sb1.append(aSequence);
                }
            }

            System.out.println("Sorted String: ");
            System.out.println(sb1);
            System.out.println("");


            return sb1.toString();
        }

        return "";
    }


    public static String sort(String input){

        if((input != null) || !input.isEmpty()){

        }

        return "";

    }
}
