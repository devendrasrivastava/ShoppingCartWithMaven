package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void getId() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(1, p.getId());
    }

    @Test
    void getName() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("Biscuit", p.getName());
    }

    @Test
    void getQuantity() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(800, p.getQuantity());
    }

    @Test
    void getPrice() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(10, p.getPrice());
    }

    @Test
    void getBrand() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("Oreo", p.getBrand());
    }

    @Test
    void testToString() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("1\t\tBiscuit\t\t800\t\t\t\t10\t\t\tOreo", p.toString());
    }
}