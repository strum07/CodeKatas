package Belcan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KDifference {
    public static void main(String[] args) {
        int difference = 1;

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);
        numberList.add(2);

        System.out.println(getKDifference(numberList, difference));
    }

    private static int getKDifference(List<Integer> numberList, int difference) {
        int count = 0;

        HashMap<Integer, Integer> differenceMap = new HashMap<>();
        for (int currentNumber : numberList) {
            int currentNumberDifference = currentNumber - difference;
            differenceMap.put(currentNumber, currentNumberDifference);
        }

        for (Map.Entry<Integer, Integer> entry : differenceMap.entrySet()) {
            if (differenceMap.containsKey(entry.getValue())) {
                count++;
            }
        }
//        System.out.println(differenceMap);
//        System.out.println(count);
        return count;
    }
}
