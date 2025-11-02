package DSA.JD04_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Arr07FindLongestPalindromeInArray {
    public static void main(String[] args) {

        String str = "ccc";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            freqMap.put(str.charAt(i), freqMap.getOrDefault(str.charAt(i),0)+1);

        }

        System.out.println(freqMap);

        int wordSum=0;
        boolean singleCharFound = false;
        for (Map.Entry i : freqMap.entrySet()){
            if(((int) i.getValue())%2==0){
                System.out.println((int) i.getValue());
                wordSum = wordSum+ (int) i.getValue();
            }else{
                wordSum = wordSum+ ((int) i.getValue()-1);
                singleCharFound=true;
            }
        }

        if(singleCharFound){
            wordSum= wordSum + 1;
        }

        System.out.println("the longest palindrome can be created has length "+ wordSum);
    }
}
