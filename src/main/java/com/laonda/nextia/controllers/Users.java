package com.laonda.nextia.controllers;

import com.laonda.nextia.dto.UsersDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class Users {

    @GetMapping(path = "/{id}", produces = "application/json")
    public UsersDto getUser(@PathVariable int id) {
        return new UsersDto("miguelon", "miguelon@email.com");
    }
}
