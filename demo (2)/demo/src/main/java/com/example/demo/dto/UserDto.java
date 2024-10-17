package com.example.demo.dto;

import com.example.demo.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String name;
    private String email;
    private List<Order> orders;


}
