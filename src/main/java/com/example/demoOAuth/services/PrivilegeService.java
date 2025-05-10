package com.example.demoOAuth.services;


import com.example.demoOAuth.dtos.PrivilegeDto;
import com.example.demoOAuth.entity.Privilege;
import com.example.demoOAuth.repositories.PrivilegeRepository;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService {
    private final PrivilegeRepository repository;

    public PrivilegeService(PrivilegeRepository repository) {
        this.repository = repository;
    }

    public PrivilegeDto createPrivilege(PrivilegeDto dto){
        Privilege privilege = Privilege.builder()
                .name(dto.getName())
                .build();
        repository.save(privilege);
        return  dto;
    }
}
