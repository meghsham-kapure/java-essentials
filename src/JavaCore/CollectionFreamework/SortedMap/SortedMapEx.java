package JavaCore.CollectionFreamework.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMapEx {

    public static void main(String[] args) {
        
        SortedMap <Integer, String > sortedMap = new TreeMap<>();
        // SortedMap <Integer, String > sortedMap = new TreeMap<>( (a,b) ->b-a);

        sortedMap.put(1,"Priyanka");
        sortedMap.put(5,"Prajakta");
        sortedMap.put(2,"Ashwini");
        sortedMap.put(4,"Richa");
        sortedMap.put(3,"Namita");
        // sortedMap.put(null,"Rakesh"); cant have null as key
        sortedMap.put(6,null); // can have null value


        System.out.println(sortedMap);
        // System.out.println("****");
        // System.out.println(sortedMap.reversed());
        

        // System.out.println(sortedMap.get(sortedMap.firstKey()));
        // System.out.println(sortedMap.get(sortedMap.lastKey()));

        // System.out.println(sortedMap.firstEntry());
        // System.out.println(sortedMap.lastEntry());

        System.out.println(sortedMap.headMap(3)); // key is excluded
        System.out.println(sortedMap.tailMap(3)); // key is included

        // System.out.println(sortedMap.subMap(2, 4)); // key is excluded



    }
}