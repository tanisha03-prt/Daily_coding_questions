import java.util.Scanner;

// Base Class
class Ride {
    int baseFare;
    int distance;

    Ride(int baseFare, int distance) {
        this.baseFare = baseFare;
        this.distance = distance;
    }

    int calculateFare() {
        return baseFare;
    }
}

// Mini Ride
class Mini extends Ride {

    Mini(int baseFare, int distance) {
        super(baseFare, distance);
    }

    @Override
    int calculateFare() {
        return baseFare + (distance * 5);
    }
}

// Sedan Ride
class Sedan extends Ride {

    Sedan(int baseFare, int distance) {
        super(baseFare, distance);
    }

    @Override
    int calculateFare() {
        return baseFare + (distance * 10);
    }
}

// SUV Ride
class SUV extends Ride {

    SUV(int baseFare, int distance) {
        super(baseFare, distance);
    }

    @Override
    int calculateFare() {
        return baseFare + (distance * 15);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rideType = sc.next();
        int baseFare = sc.nextInt();
        int distance = sc.nextInt();

        Ride ride;   // Parent class reference (Dynamic Method Dispatch)

        if (rideType.equalsIgnoreCase("Mini")) {
            ride = new Mini(baseFare, distance);
        } else if (rideType.equalsIgnoreCase("Sedan")) {
            ride = new Sedan(baseFare, distance);
        } else {
            ride = new SUV(baseFare, distance);
        }

        System.out.println("Final Fare: " + ride.calculateFare());

        sc.close();
    }
}