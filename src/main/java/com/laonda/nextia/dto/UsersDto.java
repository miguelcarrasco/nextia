package com.laonda.nextia.dto;

import com.laonda.nextia.model.User;

public class UsersDto {
    private Long id;
    private String email;

    public UsersDto(User user) {
        id = user.getId();
        email = user.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
