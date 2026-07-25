import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s) {
        //sorting in asending order
        return this.age - s.age;
        //sorting in desending order
        //return that.age - s.order
    }

    public String toString() {
        return name + " " + age;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", 22));
        list.add(new Student("Aditya", 19));
        list.add(new Student("Aman", 20));

        Collections.sort(list);

        System.out.println(list);
    }
}