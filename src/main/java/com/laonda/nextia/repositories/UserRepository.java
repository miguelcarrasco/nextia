package com.laonda.nextia.repositories;

import com.laonda.nextia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
