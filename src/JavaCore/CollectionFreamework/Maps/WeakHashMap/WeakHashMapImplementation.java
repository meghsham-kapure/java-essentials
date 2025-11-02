package JavaCore.CollectionFreamework.Maps.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapImplementation {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println("Before Garbage Collection"+imageCache);
        simulateApplicationUsage();
        System.gc();
        System.out.println("After Garbage Collection"+imageCache);
;


    }

    public static void simulateApplicationUsage ()  {
       try{
           Thread.sleep(10000);
       }
       catch (Exception Ignored){}
    }




    public static void loadCache(Map<String, Image> imageCache){
        String keyOne = new String("imageOne");
        String keyTwo = new String(" imageTwo");
        imageCache.put(keyOne, new Image("IMG-1"));
        imageCache.put(keyTwo, new Image("IMG-2"));
    }
}


class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
