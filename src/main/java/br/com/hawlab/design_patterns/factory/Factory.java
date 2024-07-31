package br.com.hawlab.design_patterns.factory;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

public class Factory {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Factory)");

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();

        System.out.println("------------------------------------------");
    }
}
