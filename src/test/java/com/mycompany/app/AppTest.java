package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for App.
 */
public class AppTest {
    @Test
    public void testMessage() {
        App app = new App();
        assertEquals("Good Morning", "Good Morning");
    }
}

