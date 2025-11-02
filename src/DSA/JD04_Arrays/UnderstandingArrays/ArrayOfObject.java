package DSA.JD04_Arrays.UnderstandingArrays;

class Student{
    private int id;
    private String name;
    private float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {

        Student [] studentArrays = new Student[5];
        studentArrays[0] = new Student(1,"Meghsham", 76.0f);
        studentArrays[1] = new Student(2,"Randhir", 58.4f);
        studentArrays[2] = new Student(3,"Asim", 87.7f);
        studentArrays[3] = new Student(4,"Omkar", 70.30f);
        studentArrays[4] = new Student(5,"Pankaj", 36.0f);

        for ( Student std : studentArrays){
            System.out.println(std);
        }
    }
}
