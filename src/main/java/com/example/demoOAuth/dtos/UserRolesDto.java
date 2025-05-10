package com.example.demoOAuth.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserRolesDto {
    private Integer userId;
    private List<Integer> roleIds;
}
