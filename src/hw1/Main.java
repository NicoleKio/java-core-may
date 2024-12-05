package hw1;

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

    Book book1 = new Book("Parfnoth", 15, new String[]{"author1", "author2"}, "male");

    Dog[] dogs = new Dog[]{
            new Dog("Dodo",10, "kolye"),
            new Dog("Dodo2",202, "kolye2"),
    };
}