package constructor;


class Student{
    int roll;
    Student(){
        this(23);
    }
    Student(int roll){
        this.roll = roll;
    }
    void display(){
        System.out.println(roll);
    }
}

public class constructor_chaining {
    public static void main(String[] args) {
        Student s = new Student();
    
        
    }
    
}
