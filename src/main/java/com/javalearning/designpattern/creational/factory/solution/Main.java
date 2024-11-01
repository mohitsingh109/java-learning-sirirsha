package com.javalearning.designpattern.creational.factory.solution;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.orderVehicle("car"); // cache miss
        orderService.orderVehicle("car"); // present in cache
        orderService.orderVehicle("bike");
    }
}
