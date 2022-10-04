package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }
    public List<Order> getOrdersBasedOnTheTransferredScope (LocalDate from, LocalDate to) {
        return orderList.stream()
                .filter(d -> d.getDate().equals(from)  && d.getDate().equals(to))
                .collect(Collectors.toList());
    }

    public List<Order> getLowestAndHighestValues(double lowest, double highest) {
        return orderList.stream()
                .filter(v -> v.getOrderValue() >= lowest && v.getOrderValue() <= highest)
                .collect(Collectors.toList());

    }

    public int getOrderList () {
        return this.orderList.size();
    }
    public double getSumOfValues() {
        return orderList.stream()
                .map(v -> v.getOrderValue())
                .mapToDouble(v -> v)
                .sum();


    }
}
