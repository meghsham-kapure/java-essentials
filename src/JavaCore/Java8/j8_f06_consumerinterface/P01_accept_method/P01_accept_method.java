package CoreJavaTopics.java8_features.jf06_consumerinterface.p01_accept_method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class P01_accept_method {
    public static void main(String[] args) {
    
        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Meghsham",76));
        studentList.add(new Student(2,"Vishal",96));
        studentList.add(new Student(3,"Shubham",98));
        studentList.add(new Student(4,"Mayursh",68));
        studentList.add(new Student(5,"Chirag",36));

        Consumer <List<Student>> displayStudnetInLowerCase = studentListParam ->{
            for (Student student : studentList) {
                System.out.println(student.getName().toLowerCase());
            }
        };

        Consumer <List<Student>> displayStudnetInUpperCase = studentListParam ->{
            for (Student student : studentList) {
                System.out.println(student.getName().toUpperCase());
            }
        };

        
        Consumer<List<Student>> displyStudentListInCases = displayStudnetInLowerCase.andThen(displayStudnetInUpperCase);
        displyStudentListInCases.accept(studentList);
    }    
}


class Student {
    private Integer id;
    private String name;
    private Integer mark;
     public Integer getId() {
         return id;
     }
     public void setId(Integer id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public Integer getMark() {
         return mark;
     }
     public void setMark(Integer mark) {
         this.mark = mark;
     }
     public Student(Integer id, String name, Integer mark) {
         this.id = id;
         this.name = name;
         this.mark = mark;
     }
     @Override
     public String toString() {
         return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getMark()=" + getMark() + "]";
     }
 }