package com.example.demoOAuth.repositories;

import com.example.demoOAuth.entity.OAuthAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthAccessTokenRepository extends JpaRepository<OAuthAccessToken, String> {
    // Define custom queries if needed
}
