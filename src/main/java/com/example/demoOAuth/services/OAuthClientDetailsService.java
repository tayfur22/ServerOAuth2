package com.example.demoOAuth.services;

import com.example.demoOAuth.dtos.OAuthClientDetailDto;
import com.example.demoOAuth.entity.OAuthClientDetails;
import com.example.demoOAuth.repositories.OAuthClientDetailsRepository;
import com.example.demoOAuth.resources.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Service
public class OAuthClientDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    OAuthClientDetailsRepository clientDetailsRepository;
    public OAuthClientDetailDto create(OAuthClientDetailDto dto){
        OAuthClientDetails ent = OAuthClientDetails.builder()
                .clientId(dto.getClientId())
                .clientSecret(passwordEncoder.encode(dto.getClientSecret()))
                .scope("read")
                .authorizedGrantTypes("password,refresh_token")
                .webServerRedirectUri(null)
                .accessTokenValidity(900)
                .refreshTokenValidity(1800)
                .resource(Resource.builder().id(dto.getResourceId()).build())
                .build();
        clientDetailsRepository.save(ent);
        return dto;
    }
}

