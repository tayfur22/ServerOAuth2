package com.example.demoOAuth.repositories;

import com.example.demoOAuth.entity.OAuthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthClientDetailsRepository extends JpaRepository<OAuthClientDetails, Long> {
    // Additional query methods if needed
}

