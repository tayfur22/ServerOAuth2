package com.example.demoOAuth.repositories;

import com.example.demoOAuth.entity.OAuthRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthRefreshTokenRepository extends JpaRepository<OAuthRefreshToken, String> {
    // Define custom queries if needed
}

