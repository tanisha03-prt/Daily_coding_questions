package class_object;
class Car {
    String brand;
    int price;

    int discountedPrice(int percent) {
        if (percent > 100 || percent < 0) {
            System.out.println("Invalid Discount");
            return price;
        }

        int discount = (price * percent) / 100;
        return price - discount;
    }
}
public class car_class {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.price = 1000;

        int finalPrice = c.discountedPrice(20);
        System.out.println(finalPrice);
    }
}