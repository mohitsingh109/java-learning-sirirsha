package com.javalearning.designpattern.creational.factory.solution;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<String, Vehicle> vehicleCache = new HashMap<>();
    public static Vehicle createVehicle(String type) {

        if(vehicleCache.containsKey(type)) {
            System.out.println("from cache");
            return vehicleCache.get(type);
        }
        System.out.println("not present in cache");

        Vehicle vehicle = null;
        switch (type) {
            case "car":
                vehicle = new Car();
                break;
            case "bike":
                vehicle = new Bike();
                break;
            case "truck":
                vehicle = new Truck();
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
        vehicleCache.put(type, vehicle);
        return vehicle;
    }
}
