package com.laonda.nextia.controllers;

import com.laonda.nextia.dto.UserBankAccountCreationDto;
import com.laonda.nextia.dto.UsersDto;
import com.laonda.nextia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

@RestController
@RequestMapping("/users")
public class Users {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UsersDto createUser(@RequestBody UserBankAccountCreationDto userBankAccountCreationDto)
            throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        UsersDto usersDto = userService.createUser(userBankAccountCreationDto);
        return usersDto;
    }
}
