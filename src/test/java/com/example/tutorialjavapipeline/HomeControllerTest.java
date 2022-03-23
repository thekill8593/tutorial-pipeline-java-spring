package com.example.tutorialjavapipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.tutorialjavapipeline.controllers.HomeController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeControllerTest {

    @Autowired
    HomeController homeController;

    @Test
    public void homeController_healthCheck_returnsOk() {
        assertEquals(homeController.healthCheck(), "OK");
    }

    @Test
    public void homeController_getPeople_returnsListOf20People() {
        assertEquals(homeController.getPeople().size(), 20);
    }

    @Test
    public void homeController_getAddresses_returnsListOf10Addresses() {
        assertEquals(homeController.getAddresses().size(), 10);
    }

}
