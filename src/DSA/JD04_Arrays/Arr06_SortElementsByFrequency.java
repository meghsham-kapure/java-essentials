package DSA.JD04_Arrays;

import java.util.*;

public class Arr06_SortElementsByFrequency{
    public static void main(String[] args) {
        int nums[] = new int[]{3, 3, 1, 1, 1, 1,4,5,7,2,4,3,1, 2, 2, 3, 2, 3, 3};
        HashMap <Integer,Integer> numFreq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i],numFreq.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(numFreq.entrySet());
        entries.sort((e1, e2) -> {
            if (e1.getValue() == e2.getValue()){
                return e2.getKey()- e1.getKey();
            }
            return e1.getValue() - e2.getValue();
        });

        int sortedByFrequecy [] = new int[nums.length];
        int counter = 0;
        for (Map.Entry<Integer,Integer> i : entries){
            Integer key = i.getKey();
            Integer value = i.getValue();
            for (int j = 0; j < value; j++) {
                sortedByFrequecy[counter++]=(int) key;
            }
        }

        System.out.println(Arrays.toString(sortedByFrequecy));
    }
}