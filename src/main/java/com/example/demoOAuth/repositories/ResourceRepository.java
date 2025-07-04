package com.example.demoOAuth.repositories;

import com.example.demoOAuth.resources.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    // Additional query methods if needed
}

