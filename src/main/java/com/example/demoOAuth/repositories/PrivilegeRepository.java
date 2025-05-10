package com.example.demoOAuth.repositories;

import com.example.demoOAuth.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
//    Optional<UserEntity> findByUsername(String username);
}
