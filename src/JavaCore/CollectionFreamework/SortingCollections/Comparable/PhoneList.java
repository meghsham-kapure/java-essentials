package JavaCore.CollectionFreamework.SortingCollections.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneList {
    public static void main(String[] args) {
        ArrayList <Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Google Pixel 9 Pro",1299));
        phoneList.add(new Phone("Apple iPhone 15 Pro Max",1399));
        phoneList.add(new Phone("Samsung Galaxy S24 Ultra",1199.99));
        phoneList.add(new Phone("OnePlus 12",899));
        phoneList.add(new Phone("Xiaomi 14 Pro",999));
        phoneList.add(new Phone("Oppo Find X6 Pro",1170));
        phoneList.add(new Phone("Honor Magic5 Pro",1005));
        phoneList.add(new Phone("Vivo X100 Pro",1050));
        phoneList.add(new Phone("Sony Xperia 1 V",1399));
        phoneList.add(new Phone(" ASUS ROG Phone",1224));


        System.out.println("Unsorted Phone List : ");
        System.out.println(phoneList);

        Collections.sort(phoneList);

        System.out.println("Sorted Phone List : ");
        System.out.println(phoneList);
    }
}
