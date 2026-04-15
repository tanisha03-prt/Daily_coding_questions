package class_object;

class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class student_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tanisha";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}