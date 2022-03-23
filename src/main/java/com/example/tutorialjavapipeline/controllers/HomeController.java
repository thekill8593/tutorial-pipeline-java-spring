package com.example.tutorialjavapipeline.controllers;

import java.util.List;

import com.arakelian.faker.model.Address;
import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomAddress;
import com.arakelian.faker.service.RandomPerson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/people")
    public List<Person> getPeople() {
        return RandomPerson.get().listOf(20);
    }

    @GetMapping("/addresses")
    public List<Address> getAddresses() {
        return RandomAddress.get().listOf(10);
    }

}
