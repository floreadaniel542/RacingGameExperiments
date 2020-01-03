package org.fasttrackit;

public class Vehicle {
    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    boolean running;
    int wheelCount;
    int numberOfSeats;
    double lenght;
    double widht;
    double height;
    String color;
    String wheelsColor;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheelsColor() {
        return wheelsColor;
    }

    public void setWheelsColor(String wheelsColor) {
        this.wheelsColor = wheelsColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public double acelerate(double speed , double durationInHours) {
        System.out.println(name + "is acelerateing with " + speed + " km/h for" + durationInHours + "h");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;
        //sau ca sa fie tot acelasi lucru
        // traveledDistance += distance;

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel );


        return  distance;
    }
}
