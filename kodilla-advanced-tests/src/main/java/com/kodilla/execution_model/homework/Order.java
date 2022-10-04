package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
   private double orderValue;
   private String login;
   private LocalDate date;

    public Order(double orderValue, String login, LocalDate date) {
        this.orderValue = orderValue;
        this.login = login;
        this.date = date;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", login='" + login + '\'' +
                ", date=" + date +
                '}';
    }
}
