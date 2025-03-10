package lesson.lesson2.HW.task2;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "red", 12000);
        Car car2 = new Car("KIA", "green", 10000);

        car1.setType("Mersedes");
        car1.setColor("blue");
        car1.setPrice(22000);
        System.out.println(car1.getType() + " " + car1.getColor() + " " + car1.getPrice());

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String color = scanner.nextLine();
        int price = scanner.nextInt();

        Car car3 = new Car(type, color, price);

        System.out.println(car3.getType() + " " + car3.getColor() + " " + car3.getPrice());

    }
}
