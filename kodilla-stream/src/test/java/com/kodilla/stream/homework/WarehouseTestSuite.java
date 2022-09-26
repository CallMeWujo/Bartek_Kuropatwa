package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("7"));
        String result = warehouse.getOrder("7").getNumber();
        assertEquals("7",result);


    }
    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
         assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("1"));
    }

}