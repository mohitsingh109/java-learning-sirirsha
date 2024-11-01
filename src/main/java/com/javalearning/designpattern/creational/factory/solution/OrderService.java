package com.javalearning.designpattern.creational.factory.solution;

public class OrderService {

    public void orderVehicle(String type) {
        try {
            Vehicle vehicle = VehicleFactory.createVehicle(type);
            vehicle.rent();
        }catch (IllegalAccessError e) {
            System.out.println(e.getMessage());
        }
    }
}
