package CoreJavaTopics.collectionfreamework.CustomSorting.UsingComparator;

import java.util.ArrayList;
import java.util.Comparator;

class Studnet implements Comparable <Studnet>  {
    int Id;
    String Name;
    double Gpa;

    public Studnet(int id, String name, double Gpa) {
        this.Id = id;
        this.Name = name;
        this.Gpa = Gpa;
    }

    @Override
    public int compareTo(Studnet s) {
       return this.Id - s.Id ;
    }

    @Override
    public String toString() {
        return "Studnet [Id=" + Id + ", Name=" + Name + ", Gpa=" + Gpa + "]";
    }
}

class CustomSortingByID implements Comparator <Studnet>{

    @Override
    public int compare(Studnet s1, Studnet s2) {
        return s2.Id - s1.Id ;
    }

}

class CustomSortingByGpa implements Comparator <Studnet>{

    @Override
    public int compare(Studnet s1, Studnet s2) {
        return Double.compare(s1.Gpa, s2.Gpa) ;
    }

}

public class StudentSorting {
    public static void main(String[] args) {

        ArrayList <Studnet> studnets = new ArrayList<>();
        studnets.add(new Studnet(5, "Jitrndra", 3.4));
        studnets.add(new Studnet(15, "Rajendra", 3.9));
        studnets.add(new Studnet(35, "Ankita", 4.9));
        studnets.add(new Studnet(7, "priyanaka", 4.2));
        studnets.add(new Studnet(14, "Madhusudhan",2.8));
        studnets.add(new Studnet(81, "Rohit",1.2));

        // // Natural Ordering using Comrable
        // Collections.sort(studnets);
        // System.out.println(studnets);

        // // Custum Ordering by Id using Comparator 
        // studnets.sort(new CustomSortingByID());
        // System.out.println(studnets);
    
        // Custum Ordering by Gpa using Comparator 
        studnets.sort(new CustomSortingByGpa());
        System.out.println(studnets);
    }
}