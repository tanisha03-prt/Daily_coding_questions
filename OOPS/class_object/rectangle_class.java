package class_object;

class Rectangle{
    int length;
    int width;

    void area(){
        System.out.println(length * width);
    }
}
public class rectangle_class {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 34;
        r.width = 87;
        r.area();

        
    }
    
}
