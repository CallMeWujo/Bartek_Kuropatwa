package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
         assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("1"));
    }

}