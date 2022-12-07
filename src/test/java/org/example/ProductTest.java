package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;

class ProductTest {


    @Test
    void getId() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(1, p.getId(), "Error in product id");
    }

    @Test
    void getName() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("Biscuit", p.getName(),"Error in product name");
    }

    @Test
    void getQuantity() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(800, p.getQuantity(),"Error in product Quantity");
    }

    @Test
    void getPrice() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals(10, p.getPrice(), "Error in product Price");
    }

    @Test
    void getBrand() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("Oreo", p.getBrand(), "Error in product Brand");
    }

    @Test
    void testToString() {
        Product p = new Product(1, "Biscuit", 800, 10, "Oreo");
        assertEquals("1\t\tBiscuit\t\t800\t\t\t\t10\t\t\tOreo", p.toString(), "Error in product Product List");
    }
}

