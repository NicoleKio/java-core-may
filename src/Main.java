import hw1.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", "high", 1111, true);
        Car car2 = new Car("tesla", "high", 1111, true);
        Car car3 = new Car("tesla", "high", 1111, true);
        Car car4 = new Car("tesla", "high", 1111, true);
        Car car5 = new Car("tesla", "high", 1111, true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);

        }
    }
