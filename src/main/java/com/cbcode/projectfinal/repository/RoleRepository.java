package com.cbcode.projectfinal.repository;

import com.cbcode.projectfinal.models.ERole;
import com.cbcode.projectfinal.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
