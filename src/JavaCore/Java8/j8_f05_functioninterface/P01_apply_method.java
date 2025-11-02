package CoreJavaTopics.java8_features.jf05_functioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class P01_apply_method {
    public static void main(String[] args) {
       
        Integer number1 = 10;
        Function <Integer,Integer> doubleIt = n -> n*2;
        System.out.println(doubleIt.apply(number1));       
        
        String lowerCaseString = "milkha singh ";

        Function <String,String> convertItToUpperCase = str -> str.toUpperCase();
        System.out.println(convertItToUpperCase.apply(lowerCaseString));
        
        Function <String, Integer> lengthCount = str -> str.length();
        System.out.println(lengthCount.apply("Meghsham Kapure"));
    
        List<Integer> numberAL = new ArrayList<>(Arrays.asList(42, 91, 73, 28, 99, 76));

        Function <Integer, Boolean> isEven = n -> n % 2 == 0;

        Function < List<Integer> , List<Integer> > evenNumberList = numList -> {
            List <Integer> evenNumList = new ArrayList<>();

            for (Integer integer : numList) {
                if (isEven.apply(integer)){
                    evenNumList.add(integer);
                }
                
            }
               return evenNumList;
        } ;

        List<Integer> finalEvenNumberList= evenNumberList.apply(numberAL);
        System.out.println(finalEvenNumberList);


        List <Student> studentList = new ArrayList<> ();
        studentList.add(new Student(1,"Meghsham",76));
        studentList.add(new Student(2,"Vishal",96));
        studentList.add(new Student(3,"Shubham",98));
        studentList.add(new Student(4,"Mayursh",68));
        studentList.add(new Student(5,"Chiraj",36));


        Function < List<Student>, List<Student> > getToppers  =  students -> {
            List <Student> topperList = new ArrayList<>();
            
            for (Student student : students) {
                if (student.getMark()>90){
                    topperList.add(student);
                }
            }
            
            return topperList;
        };

        Function <List <Student>, List <String> > getInString= studentsList-> {
            List <String> studentListInString = new ArrayList();
            
            for (Student student : studentsList ){
                String studentString = " "+student.getId()+" || "+student.getName()+" || "+student.getMark()+" ";
                studentListInString.add (studentString);
            }
            return studentListInString;
        };

        List <String> topperList = getToppers.andThen(getInString).apply(studentList);
        System.out.println(topperList);
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