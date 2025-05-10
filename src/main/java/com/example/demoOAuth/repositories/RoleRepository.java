package com.example.demoOAuth.repositories;

import com.example.demoOAuth.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserRole, Integer> {
//    Optional<UserEntity> findByUsername(String username);
}
