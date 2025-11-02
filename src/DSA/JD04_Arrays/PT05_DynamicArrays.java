package DSA.JD04_Arrays;

import java.util.ArrayList;
import java.util.List;

public class PT05_DynamicArrays {

    public static void main(String[] args) {
        ArrayList<Integer> numAL = new ArrayList<>(5);

        //Adding elements
        numAL.add((10));
        numAL.add((65));
        numAL.add((68));
        numAL.add((29));
        numAL.add((38));
        numAL.add((11));
        numAL.add((11));
        numAL.add((11));
        numAL.add((74));
        numAL.add((96));
        numAL.add((17));
        numAL.add((83));

        // add at index 0
        numAL.addFirst(20);

        // add at index length-1
        numAL.addLast(10);

        // add all elements in given collection at the end
        numAL.addAll(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(numAL);

        // Remove elements

        // accepts actual element and remove its first occurrence from AL
        Integer integerObject = 11;
        numAL.remove(integerObject);
        System.out.println(numAL);


        // removes element on the specified index
        numAL.remove(5);

        // remove from index 0
        numAL.removeFirst();

        // remove from index length-1
        numAL.removeLast();

        //removes element given in collection of object, every occurrence of the element is removed
        numAL.removeAll(List.of(19, 17, 11));

        System.out.println(numAL);

        //returns the element from given index
        Integer gotElement1 = numAL.get(5);

        //returns the index 0 element
        Integer gotElement2 = numAL.getFirst();

        //returns the index length-1 element
        Integer gotElement3 = numAL.getLast();

        //return the size (present element) in the arraylist
        int listSize = numAL.size();

        // return the index of give element, if not found  then -1
        Integer searchElement = 11;
        numAL.indexOf(searchElement);

        // reversed the arraylist
        numAL.reversed();
    }
}


/*
 * ArrayList is Java's implementation of dynamic arrays (i.e. arrays that does not have size , we can add as much element as we want)
 * if not specified explicitly java arraylist is of size 10 and internally same length of array is used to store the element,
 * but when its
 * */