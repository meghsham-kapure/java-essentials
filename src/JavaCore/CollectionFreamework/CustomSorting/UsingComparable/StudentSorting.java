package JavaCore.CollectionFreamework.CustomSorting.UsingComparable;

import java.util.ArrayList;
import java.util.Collections;

class Studnet implements Comparable <Studnet> {
    private int Id;
    String Name;

    public Studnet(int id, String name) {
        this.Id = id;
        this.Name = name;
    }
   
    @Override
    public int compareTo(Studnet s) {
       return s.Id - this.Id;
    }

    @Override
    public String toString() {
        return "Studnet [Id=" + Id + ", Name=" + Name + "]+";
    }
}

public class StudentSorting {
    public static void main(String[] args) {

        ArrayList <Studnet> studnets = new ArrayList<>();
        studnets.add(new Studnet(5, "Jitrndra"));
        studnets.add(new Studnet(15, "Rajendra"));
        studnets.add(new Studnet(35, "Ankita"));
        studnets.add(new Studnet(7, "priyanaka"));
        studnets.add(new Studnet(14, "Madhusudhan"));
        studnets.add(new Studnet(81, "Rohit"));

        Collections.sort(studnets);
        System.out.println(studnets);
        
    }
}