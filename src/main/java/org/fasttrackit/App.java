package org.fasttrackit;

import javax.sound.sampled.AudioFileFormat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // this is a one-line comment ( ca sa explici ce ai facut de preferat sa inteleaga si altii )
        Car car = new Car();
        car.name = "BMW";
        car.fuelLevel = 65;
        car.mileage = 8.5;
        car.doorCount = 3;
        car.maxSpeed = 290;
        car.numberOfSeats = 4;
        car.height = 1.5;
        car.lenght = 3.8;
        car.wheelCount = 4;
        car.widht = 1.5;
        car.fuelType = "Gasoline";
        car.color = "Black";
        car.wheelsColor = "Burgundy";
        car.weight = 1795;

        Engine engine1 = new Engine();
        engine1.manufacturer = "Bmw";
        engine1.capacity = 3000;
        engine1.name = "V8 Biturbo";

        car.engine = engine1;

        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        Car car2 = new Car();
        car2.name = "Audi";
        car2.fuelLevel = 70;
        car2.mileage = 12.9;
        car2.doorCount = 2;
        car2.maxSpeed = 390;
        car2.widht = 1.7;
        car2.wheelCount = 4;
        car2.lenght = 2.7;
        car2.height = 1.3;
        car2.numberOfSeats = 2;
        car2.fuelType = "Gasoline";
        car2.color = "Red";
        car2.wheelsColor = "Gray";
        car2.weight = 1640;

        Engine engine2 = new Engine();
        engine2.manufacturer = "Audi";
        engine2.capacity = 4500;
        engine2.name = "V12";

        car2.engine = engine2;

        System.out.println("Car2 name:" + car2.name);
        System.out.println("Car1 name" + car.name);


    }
}
