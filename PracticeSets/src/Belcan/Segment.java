package Belcan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Segment {
    public static void main(String[] args) {
        int subArraySize = 1;

        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(5);
        numberList.add(4);
        numberList.add(6);
        numberList.add(8);

        System.out.println(numberList);

        System.out.println(segment(subArraySize, numberList));
    }

    private static int segment(int subArraySize, List<Integer> numberList) {
        List<Integer> minimumElementList = new ArrayList<>();
        List<List<Integer>> subArraysList = new ArrayList<>();

        int start = 0;
        int end = 0;

        populateSubarrays(numberList, start, end, subArraySize, subArraysList);
        populateMinimumElementInList(subArraysList, minimumElementList);

//        System.out.println(subArraysList);
//        System.out.println(minimumElementList);
//        System.out.println(Collections.max(minimumElementList));

        return Collections.max(minimumElementList);
    }

    private static void populateMinimumElementInList(List<List<Integer>> subArraysList, List<Integer> minimumElementList) {
        for (List<Integer> integers : subArraysList) {
            minimumElementList.add(Collections.min(integers));
        }
    }

    private static void populateSubarrays(List<Integer> numberList, int start, int end, int subArraySize, List<List<Integer>> subArraysList) {

        if (numberList == null || numberList.isEmpty() || numberList.size() < subArraySize)
            return;

        start = 0;
        end = subArraySize - 1;
        int s = start;
        int e = end;

        int count = 1;
        for (int j = start; j <= numberList.size() - subArraySize; j++) {
            List<Integer> tempArray = IntStream.rangeClosed(start, end)
                    .mapToObj(numberList::get)
                    .collect(Collectors.toList());

            System.out.println(count++);
            start = s + 1;
            end = e + 1;
            s = start;
            e = end;

            subArraysList.add(tempArray);
        }
    }
}
