package JavaCore.CollectionFreamework.Comparator;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<>();
	    list.add(10);
	    list.add(40);
	    list.add(20);
	    list.add(30);
	    list.add(60);
	    list.add(50);
	    
	    System.out.println(list);

        //natural sort : using build in soringing in integer
            // Collections.sort(list);
            // System.out.println(list);
                // [10, 40, 20, 30, 60, 50]
                //[10, 20, 30, 40, 50, 60]


        //custom sort : ascdending
            // list.sort(new ascSortInterger());
            System.out.println(list);
                // [10, 40, 20, 30, 60, 50]
                // [10, 20, 30, 40, 50, 60]

        // custom sort : descending
            // list.sort(new desSortInterger());
            System.out.println(list);
                // [10, 40, 20, 30, 60, 50]
                // [60, 50, 40, 30, 20, 10]
                
        //lambda implemetation for the same
            // list.sort( (a,b)-> b-a);
            // System.out.println(list);
        
            // list.sort( (a,b)-> a-b);
            // System.out.println(list);
        }
	   
}

class desSortInterger implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2){     
        return n2-n1;
    }
}


class ascSortInterger implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2){     
        return n1-n2;
    }
}