package com.cbcode.projectfinal.repository;

import com.cbcode.projectfinal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String findByUsername);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
