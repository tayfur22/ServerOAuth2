package com.example.demoOAuth.services;


import com.example.demoOAuth.dtos.RolePrivilegeDto;
import com.example.demoOAuth.dtos.UserRoleDto;
import com.example.demoOAuth.entity.Privilege;
import com.example.demoOAuth.entity.UserRole;
import com.example.demoOAuth.repositories.RoleRepository;
import com.example.demoOAuth.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    private final RoleRepository repository;
    private final UserRepository userRepository;
    public RoleService(RoleRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    public UserRoleDto createRole(UserRoleDto dto){
        UserRole role = new UserRole();
        role.setName(dto.getName());
        repository.save(role);
        return dto;
    }

    public RolePrivilegeDto createRole(RolePrivilegeDto dto){
        UserRole ur = repository.findById(dto.getRoleId()).get();
        List<Privilege> privileges = new ArrayList<>();
        dto.getPrivilegeId().forEach(id->{
            Privilege p = new Privilege();
            p.setId(id);
            privileges.add(p);
        });


        ur.setPrivileges(privileges);
        repository.save(ur);
        return dto;
    }
}
