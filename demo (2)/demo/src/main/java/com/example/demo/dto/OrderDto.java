package com.example.demo.dto;

import com.example.demo.model.OrderItem;
import com.example.demo.model.User;

import java.time.LocalDate;
import java.util.List;

public class OrderDto {

    private LocalDate orderDate;
    private String status;
    private long userId;
    private List<OrderItem> orderItems;

}
