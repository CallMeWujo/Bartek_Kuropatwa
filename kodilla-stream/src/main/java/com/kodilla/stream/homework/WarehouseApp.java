package com.kodilla.stream.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("99"));


        try {
            System.out.println("your order numbers is: " + warehouse.getOrder("7").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry this order doesn't exist");
        } finally {
            System.out.println("Thank you for using our shop");
        }
    }
}
