package com.laonda.nextia.services;

import com.laonda.nextia.dto.UserBankAccountCreationDto;
import com.laonda.nextia.dto.UsersDto;
import com.laonda.nextia.model.User;
import com.laonda.nextia.repositories.UserRepository;
import com.laonda.nextia.utils.CryptoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

@Component("userService")
public class UserService {
    @Value("${secretKey}")
    private String secretKey;

    @Autowired
    private UserRepository userRepository;

    public UsersDto createUser(UserBankAccountCreationDto userBankAccountCreationDto)
            throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String email = userBankAccountCreationDto.getEmail();
        String password = userBankAccountCreationDto.getPassword();

        User user = new User(userBankAccountCreationDto.getEmail(), CryptoUtils.calculateHMAC(email + password, secretKey));
        userRepository.save(user);

        return new UsersDto(user);
    }
}
