package com.sagarsudhakar.Bloomberg.Easy;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqChar {

    public static int find(String input) {

        int length = input.length();

        if(length==1){
            return 0;
        }

        if(length>1) {

            HashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();

            for (int i = 0; i < length; i++) {
                frequencyMap.put(input.charAt(i),frequencyMap.getOrDefault(input.charAt(i),0)+1);
            }

            for(int j=0;j<length;j++){
                if(frequencyMap.get(input.charAt(j))==1){
                    return j;
                }
            }
        }

        return -1;
    }
}
