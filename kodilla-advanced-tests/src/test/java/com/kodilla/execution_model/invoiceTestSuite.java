package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class invoiceTestSuite {

    Invoice invoice = new Invoice();
    Item ham = new Item("ham", 2.80);
    Item bread = new Item("bread", 3.20);
    Item potatoes = new Item("potatoes", 5.50);
    Item butter = new Item("butter", 4.20);


    @Test
    public void testAddItem() {
        int numberOfItems = invoice.getSize();
        assertEquals(4,numberOfItems);
    }

    @Test
    public void shouldGetCorrectItem() {
        Item correctItem = invoice.getItem(2);
        assertEquals("potatoes",correctItem.getName());
        assertEquals(5.50, correctItem.getPrice());

    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        Item negativeIndex = invoice.getItem(-1);
        assertNull(negativeIndex);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        Item indexOutOfRange = invoice.getItem(7);
        assertNull(indexOutOfRange);

    }
    @Test
    public void shouldDeleteAllItemsFromList() {
        invoice.clear();
        assertEquals(0,invoice.getSize());


    }

    @BeforeEach
    public void addItemsToInvoice(){
        invoice.addItem(ham);
        invoice.addItem(bread);
        invoice.addItem(potatoes);
        invoice.addItem(butter);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}