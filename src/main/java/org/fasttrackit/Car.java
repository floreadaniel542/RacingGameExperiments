package org.fasttrackit;

public class Car extends AutoVehicle {

    int doorCount;
    // has-a relationship
    Engine engine;

    public Car(Engine engine) {
        super(engine);
    }

}
