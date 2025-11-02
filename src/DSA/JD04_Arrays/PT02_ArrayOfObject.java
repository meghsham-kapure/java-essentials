package DSA.JD04_Arrays;

public class PT02_ArrayOfObject {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        students[0] = new Student("Meghsham", "Vinayak", "Kapure");
        students[1] = new Student("Sushmita", "Vinayak", "Kapure");
        students[2] = new Student("Pratham", "Dattatrey", "Suryawanshi");
        students[3] = new Student("Sneha", "Dattatrey", "Suryawanshi");
        students[4] = new Student("Vaishnavi", "Santosh", "Kapure");
        students[5] = new Student("Keshav", "Santosh", "Kapure");

        for (Student stud : students) {
            System.out.println(stud.toString());
        }
        ;
    }
}


class Student {
    private String firstName;
    private String lastName;
    private String middleName;

    Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student : " + firstName + " " + middleName + " " + lastName;
    }
}
