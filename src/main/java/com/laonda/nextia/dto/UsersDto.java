package com.laonda.nextia.dto;

public class UsersDto {
    private String name;
    private String email;

    public UsersDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
