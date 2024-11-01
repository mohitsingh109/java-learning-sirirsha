package com.javalearning.designpattern.creational.factory.wrong;

public class OrderService {

    public void orderVehicle(String type) {
        if(type.equals("car")) {
            Car car = new Car();
            car.rent();
        } else if(type.equals("bike")) {
            Bike bike = new Bike();
            bike.rent();
        } else if(type.equals("truck")) {
            Truck truck = new Truck();
            truck.rent();
        } else if(type.equals("bus")) {

        }else {
            System.out.println("Invalid vehicle type");
        }
    }
}
