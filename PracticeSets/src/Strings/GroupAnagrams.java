package Strings;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("eat");
        stringList.add("tea");
        stringList.add("tan");
        stringList.add("ate");
        stringList.add("nat");
        stringList.add("bat");


        System.out.println(printGroups(stringList));
    }

    private static ArrayList<ArrayList<String>> printGroups(List<String> stringList) {
        ArrayList<ArrayList<String>> returnList = new ArrayList<>();
        HashMap<String,ArrayList<String>> stringMap = new HashMap<>();
        HashSet<Character> cleanSet = new HashSet<>();
        for(String word: stringList){
            for(Character c:word.toCharArray()){
                   cleanSet.add(c);
            }
        }
        return returnList;
    }
}
