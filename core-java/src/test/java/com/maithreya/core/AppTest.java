package com.maithreya.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetReturnsHelloWithName() {
        String name = "Shruthi";
        String res = App.greet(name);
        assertEquals("Hello, Shruthi", res);
    }

    @Test
    void greetWithAnotherName() {
        String name = "Java";
        String res = App.greet(name);
        assertEquals("Hello, Java", res);
    }
}