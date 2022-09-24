package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Warehouse {

    public static List<Order> orders = new ArrayList<>();

    public void addOrder (Order order) {
        orders.add(order);
    }

    public Order getOrder (String number) throws OrderDoesntExistException {
        orders.stream()
                .filter(order -> order.getNumber().equals(number));
        for (Order order : orders) {
            if (order.getNumber().equals(number))
                return order;
        }
        throw new OrderDoesntExistException();
    }
}
