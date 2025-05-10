package com.example.demoOAuth.controller;


import com.example.demoOAuth.dtos.OAuthClientDetailDto;
import com.example.demoOAuth.services.OAuthClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/oauth-clients")
public class OauthClientController {

    @Autowired
    OAuthClientDetailsService service;
    @PostMapping
    public ResponseEntity<?> create(@RequestBody OAuthClientDetailDto dto){
        return ResponseEntity.ok(service.create(dto));
    }
}
