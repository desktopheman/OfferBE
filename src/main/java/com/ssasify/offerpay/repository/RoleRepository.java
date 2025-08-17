package com.ssasify.offerpay.repository;

import com.ssasify.offerpay.models.login.ERole;
import com.ssasify.offerpay.models.login.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

